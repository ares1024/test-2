package com.hd.test.livedata.test2.activity;

import android.content.Context;
import android.content.Intent;

public class GoActivity {

    public static void goSingleTopActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SingleTopActivity.class);
        context.startActivity(intent);
    }

    public static void goSingleTaskActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SingleTaskActivity.class);
        context.startActivity(intent);
    }

    public static void goSingleInstanceActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SingleInstanceActivity.class);
        context.startActivity(intent);
    }

}
