package com.a2zdaddy.authenticationapp;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by FARHAN SAIKH on 2/18/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
