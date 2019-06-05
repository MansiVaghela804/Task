package com.example.manu.task;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyGaanaActivity extends AppCompatActivity {

    Button mode,silent,vibrate,ring;
    AudioManager myaudioManager;
    private Button mButtonRingtone;
    private Button mButtonMedia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_gaana);

        // Get the widget reference from xml layout
        mButtonRingtone = findViewById(R.id.btn_play_ringtone);
        mButtonMedia = findViewById(R.id.btn_play_as_media);

        mButtonRingtone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
                Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(),uri);
                ringtone.play();
            }
        });
        mButtonMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(MyGaanaActivity.this, Settings.System.DEFAULT_RINGTONE_URI);
                player.start();
            }
        });
        mode = (Button)findViewById(R.id.mode);
        silent = (Button)findViewById(R.id.silent);
        ring = (Button)findViewById(R.id.ring);
        vibrate = (Button)findViewById(R.id.vibrate);
        myaudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myaudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(MyGaanaActivity.this, "Now Is Vibrate Mode", Toast.LENGTH_SHORT).show();
            }
        });
        silent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myaudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                Toast.makeText(MyGaanaActivity.this, "Now Is Silent Mode", Toast.LENGTH_SHORT).show();
            }
        });
        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myaudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(MyGaanaActivity.this, "Now Is Ringing Mode", Toast.LENGTH_SHORT).show();
            }
        });
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int mode = myaudioManager.getRingerMode();
                if (mode == AudioManager.RINGER_MODE_VIBRATE){
                    Toast.makeText(MyGaanaActivity.this, "Now In Vibrate Mode", Toast.LENGTH_SHORT).show();
                }else if(mode == AudioManager.RINGER_MODE_SILENT){
                    Toast.makeText(MyGaanaActivity.this, "Now Is Silent Mode", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MyGaanaActivity.this, "Now Is Ringing Mode", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
