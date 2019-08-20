package com.fig.jrttadapter;

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AdaptUtil.initAppDensity(this);
    }
}
