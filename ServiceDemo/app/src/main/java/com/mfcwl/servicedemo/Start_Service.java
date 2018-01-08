package com.mfcwl.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;


/**
 * Created by HP 240 G4 on 30-03-2017.
 */

public class Start_Service extends Service{

    private static  final  String TAG = Start_Service.class.getSimpleName();
    MediaPlayer mediaPlayer;
    @Override
    public void onCreate() {

        Log.i(TAG,"onCreated ....Service22"+Thread.currentThread().getName());
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        super.onCreate();
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG,"onStarted ....Service22"+Thread.currentThread().getName());

        return START_STICKY;

    }

    @Override
    public void onDestroy() {

        Log.i(TAG,"onDestroy ....Service22"+Thread.currentThread().getName());
        mediaPlayer.stop();
        super.onDestroy();


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
