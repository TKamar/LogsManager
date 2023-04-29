package com.example.logsmanager;


import android.util.Log;

public class LogsManager {

    private static final String TAG = "LogsManager";

    public static void logEntry() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[3].getClassName();
        String methodName = stackTraceElements[3].getMethodName();
        Log.d(TAG, "Entered " + className + "." + methodName);
    }

    public static void logExit() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[3].getClassName();
        String methodName = stackTraceElements[3].getMethodName();
        Log.d(TAG, "Exited " + className + "." + methodName);
    }
}
