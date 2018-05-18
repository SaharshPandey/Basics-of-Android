package com.example.iknownothing.learning_services;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;

public class IntentService extends android.app.IntentService {
MediaPlayer player;
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */

    public IntentService() {

        super("IntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        synchronized (this) {
            player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
            player.setLooping(true);

            if(!player.isPlaying()) {
                Log.d("services", "Service handled called");
                player.start();
                while (player.isPlaying()) {

                    }
            }
            //player.stop();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("services","Service created");

    }

    @Override
    public void onDestroy()

    {
        super.onDestroy();
        Log.d("services","Service destroyed");
        player.stop();

    }
}
