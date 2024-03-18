package com.project.incrysy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;

public class DebugActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String errMsg = "";
        String madeErrMsg = "";

        if (intent != null) {
            errMsg = intent.getStringExtra("error");

            if (errMsg != null && !errMsg.isEmpty()) {
                String[] spilt = errMsg.split("\n");

                try {
                    for (String line : spilt) {
                        if (!line.isEmpty()) {
                            madeErrMsg = parseErrorMessage(line);
                            break;
                        }
                    }
                } catch (Exception e) {
                    Log.e("DebugActivity", "Error parsing error message", e);
                }

                if (madeErrMsg.isEmpty()) {
                    madeErrMsg = errMsg;
                }
            }
        }

        showDialog(madeErrMsg);
    }

    private String parseErrorMessage(String line) {
        String message = "";
        String[] exceptionTypes = {"Exception", "Error", "AssertionError", "RuntimeException"};

        for (String exceptionType : exceptionTypes) {
            if (line.contains(exceptionType)) {
                int index = line.indexOf(exceptionType) + exceptionType.length();
                message = line.substring(index);
                break;
            }
        }

        return message;
    }

    private void showDialog(String message) {
        if (message != null && !message.isEmpty()) {
            AlertDialog.Builder bld = new Al
