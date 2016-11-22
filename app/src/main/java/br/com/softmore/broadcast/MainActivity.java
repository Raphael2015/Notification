package br.com.softmore.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.softmore.broadcast.reciver.MyBroadCast;
import br.com.softmore.broadcast.reciver.MyBroadcast2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logar(View view){
        Intent i = new Intent(this, MyBroadCast.class);
        i.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
        sendBroadcast(i);
    }

    public void broadcast(View view){
        Intent i = new Intent(this, MyBroadcast2.class);
        i.setAction("broadcast");
        sendBroadcast(i);

    }
}
