package com.jy.login.app;

import android.app.Application;



//import com.live.MyApplication;

public class MyApp extends Application {
    private static String[] modules = {"com.live.app.MyApplication"};

    public static MyApp app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initMoudles();
    }
    private void initMoudles() {
        for (String moduleImpl : modules){
            try {
                Class<?> clazz = Class.forName(moduleImpl);
                Object obj = clazz.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
