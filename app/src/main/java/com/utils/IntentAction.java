package com.utils;

import android.app.PendingIntent;
import android.os.Build;

public class IntentAction {
    public final static String NOTIFICATION_CLICK = "com.ulen.notification.click";
    public final static String NOTIFICATION_CLOSE = "com.ulen.notification.close";
    public final static String NOTIFICATION_VIEW_ORDER = "com.ulen.notification.vieworder";
    public final static String NOTIFICATION_TRACK_ORDER = "com.ulen.notification.trackorder";

    public static int getPendingIntentFlag() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            return PendingIntent.FLAG_MUTABLE;
        } else {
            return PendingIntent.FLAG_UPDATE_CURRENT;
        }
    }
}