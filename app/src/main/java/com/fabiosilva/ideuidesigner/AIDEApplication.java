package com.project.incrysy;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.google.android.gms.ads.MobileAds;

import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AIDEApplication extends Application {
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
    private ExecutorService executorService;

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this, "$appid$");

        this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

        this.executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread thread, Throwable ex) {
                    Intent intent = new Intent(getApplicationContext(), DebugActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    Writer result = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(result);
                    ex.printStackTrace(printWriter);
                    String stackTrace = result.toString();

                    intent.putExtra("error", stackTrace);

                    PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 11111, intent, PendingIntent.FLAG_ONE_SHOT);

                    AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                    am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, 1000, pendingIntent);

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                        try {
                            uncaughtExceptionHandler.uncaughtException(thread, ex);
                        } catch (Throwable throwable) {
                            Log.e("AIDEApplication", "Error in uncaughtExceptionHandler", throwable);
                        }
                    } else {
                        uncaughtExceptionHandler.uncaughtException(thread, ex);
                    }

                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(2);
                }
            });
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void showCrashDialog(final String error) {
        executorService.execute(() -> {
            runOnUiThread(() -> {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Cr
