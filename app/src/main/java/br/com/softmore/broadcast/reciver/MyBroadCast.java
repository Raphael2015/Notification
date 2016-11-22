package br.com.softmore.broadcast.reciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by rapha on 21/11/2016.
 */

public class MyBroadCast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MeuBroadCast", "Recebido...");
    }
}
