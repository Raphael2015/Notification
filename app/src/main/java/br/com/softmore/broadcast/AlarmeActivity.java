package br.com.softmore.broadcast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.softmore.broadcast.reciver.AlarmeReciver;

public class AlarmeActivity extends AppCompatActivity {
    private EditText edtSegundos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);

        edtSegundos = (EditText) findViewById(R.id.edtAlarme);
    }

    public void configurar(View view){
        String tempo = edtSegundos.getText().toString();

        int t = Integer.parseInt(tempo);

        if(!tempo.equals("")){
            Intent i = new Intent(this, AlarmeReciver.class);

            PendingIntent pi = PendingIntent.getBroadcast(this.getApplicationContext(), 1234, i, 0);

            AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() +(t *1000), pi);
        }
    }
}
