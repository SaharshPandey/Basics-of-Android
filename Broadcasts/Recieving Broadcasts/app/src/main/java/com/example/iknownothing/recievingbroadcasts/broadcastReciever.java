package com.example.iknownothing.recievingbroadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcastReciever extends BroadcastReceiver {

    public broadcastReciever()
    {

    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"BroadCast has been Recieved",Toast.LENGTH_LONG).show();

    }


}

