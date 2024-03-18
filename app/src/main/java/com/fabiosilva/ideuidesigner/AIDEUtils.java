package com.project.incrysy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.text.DecimalFormat;

public class AIDEUtils {

    private Context context;

    public AIDEUtils(Context context) {
        this.context = context;
    }

    // Toast a short message
    public void toast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    // Toast a long message
    public void toastLong(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    // Check if user has an active network connection
    public boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    // Check if a string contains only numbers
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Write an exception to local storage. It can be used for debugging, but only if you catch an exception
    // requires access to external storage
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void writeLogToLocal(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String text = sw.toString();
        File file = new File(context.getExternalFilesDir(null), "log.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.append(text);
            writer.flush();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    // Format a file size in Bytes, KB, MB, GB, TB
    public static String formatFileSize(long size) {
        String hrSize = null;

        double b = size;
        double k = size/1024.0;
        double m = ((size/1024.0)/1024.0);
        double g = (((size/1024.0)/1024.0)/1024.0);
        double t = ((((size/1024.0)/1024.0)/1024.0)/1024.0);

        DecimalFormat dec = new DecimalFormat("0.00");

        if (t > 1) {
            hrSize = dec.format(t).concat(" TB");
        } else if (g > 1) {
            hrSize = dec.format(g).concat(" GB");
        } else if (m > 1) {
            hrSize = dec.format(m).concat(" MB");
        } else if (k > 1) {
            hrSize = dec.format(k).concat(" KB");
        } else {
            hrSize = dec.format(b).concat(" Bytes");
        }

        return hrSize;
    }
}
