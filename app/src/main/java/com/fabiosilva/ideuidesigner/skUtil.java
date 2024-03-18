package com.fabiosilva.ideuidesigner;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedValue;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SparseBooleanArray;
import java.util.stream.IntStream;

public class Utils {

    private static final String TAG = "Utils";

    public static void customToast(Context context, @NonNull String message,
                                   int textColor, int textSize, int bgColor, int radius,
                                   int gravity) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        TextView textView = view.findViewById(android.R.id.message);
        textView.setTextSize(textSize);
        textView.setTextColor(textColor);
        textView.setGravity(Gravity.CENTER);

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(bgColor);
        gradientDrawable.setCornerRadius(radius);
        view.setBackground(gradientDrawable);
        view.setPadding(15, 10, 15, 10);
        view.setElevation(10);

        setGravity(view, gravity);
        toast.show();
    }

    public static void customToastWithIcon(Context context, @NonNull String message,
                                            int textColor, int textSize, int bgColor, int radius,
                                            int gravity, int icon) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        TextView textView = view.findViewById(android.R.id.message);
        textView.setTextSize(textSize);
        textView.setTextColor(textColor);
        textView.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);
        textView.setGravity(Gravity.CENTER);
        textView.setCompoundDrawablePadding(10);

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(bgColor);
        gradientDrawable.setCornerRadius(radius);
        view.setBackground(gradientDrawable);
        view.setPadding(10, 10, 10, 10);
        view.setElevation(10);

        setGravity(view, gravity);
        toast.show();
    }

    private static void setGravity(View view, int gravity) {
        Gravity.setValues(view, gravity);
    }

    public static void sortListMap(final ArrayList<HashMap<String, Object>> listMap,
                                   final String key, final boolean isNumber,
                                   final boolean ascending) {
        Collections.sort(listMap, (o1, o2) -> {
            Object v1 = o1.get(key);
            Object v2 = o2.get(key);
            int cmp = 0;
            if (isNumber) {
                if (v1 instanceof Number && v2 instanceof Number) {
                    Number n1 = (Number) v1;
                    Number n2 = (Number) v2;
                    cmp = n1.intValue() - n2.intValue();
                } else {
                    cmp = TextUtils.compare(v1.toString(), v2.toString());
                }
            } else {
                cmp = TextUtils.compare(v1.toString(), v2.toString());
            }
            return ascending ? cmp : -cmp;
        });
    }

    public static void cropImage(Activity activity, String path, int requestCode) {
        try {
            Intent intent = new Intent("com.android.camera.action.CROP");
            File file = new File(path);
            Uri contentUri = Uri.fromFile(file);
            intent.setDataAndType(contentUri, "image/*");
            intent.putExtra("crop", "true");
            intent.putExtra("aspectX", 1);
            intent.putExtra("aspectY", 1);
            intent.putExtra("outputX", 280);
            intent.putExtra("outputY", 280);
            intent.putExtra("return-data", false);
            activity.startActivityForResult(intent, requestCode);
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "Your device doesn't support the crop action!", e);
            Toast.makeText(activity, "Your device doesn't support the crop action!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Nullable
    public static String copyFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buf
