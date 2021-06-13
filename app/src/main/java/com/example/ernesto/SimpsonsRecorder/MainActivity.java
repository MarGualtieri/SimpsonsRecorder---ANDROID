package com.example.ernesto.SimpsonsRecorder;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MediaRecorder grabacion;
    private String archivoSalida = null;
    private Button btn_recorder;
    private ImageButton btn_repetir;
    private ImageButton homeroPlay;
    private ImageButton bartPlay;
    private ImageButton margePlay;
    private ImageButton lisaPlay;
    private ImageButton willyPlay;
    private ImageButton nedPlay;
    private ImageButton moePlay;
    private ImageButton burnsPlay;
    private ImageButton krustyPlay;
    private ImageButton skinnerPlay;
    private ImageButton abrahamPlay;
    private ImageButton toddPlay;
    private ImageButton milhousePlay;
    private ImageButton apuPlay;
    private ImageButton gregoryPlay;
    private ImageButton nelsonPlay;

    int repetir = 2;
    int p=0;

    MediaPlayer mp= new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_recorder = (Button) findViewById(R.id.btn_rec);
        btn_repetir = (ImageButton) findViewById(R.id.btn_repetir);

        homeroPlay = (ImageButton) findViewById(R.id.homeroPlay);
        bartPlay = (ImageButton) findViewById(R.id.bartPlay);
        margePlay = (ImageButton) findViewById(R.id.margePlay);
        lisaPlay = (ImageButton) findViewById(R.id.lisaPlay);
        willyPlay = (ImageButton) findViewById(R.id.willyPlay);
        nedPlay = (ImageButton) findViewById(R.id.nedPlay);
        moePlay = (ImageButton) findViewById(R.id.moePlay);
        burnsPlay = (ImageButton) findViewById(R.id.burnsPlay);
        nelsonPlay = (ImageButton) findViewById(R.id.nelsonPlay);
        krustyPlay = (ImageButton) findViewById(R.id.krustyPlay);
        skinnerPlay = (ImageButton) findViewById(R.id.skinnerPlay);
        abrahamPlay = (ImageButton) findViewById(R.id.abrahamPlay);
        toddPlay = (ImageButton) findViewById(R.id.toddPlay);
        milhousePlay = (ImageButton) findViewById(R.id.milhousePlay);
        apuPlay = (ImageButton) findViewById(R.id.apuPlay);
        gregoryPlay = (ImageButton) findViewById(R.id.gregoryPlay);



        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }

    public void Recorder(View view) {
        if (grabacion == null) {
            archivoSalida = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Grabacion.mp3";
            grabacion = new MediaRecorder();
            grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
            grabacion.setOutputFile(archivoSalida);

            try {
                grabacion.prepare();
                grabacion.start();
            } catch (IOException e) {
            }

            btn_recorder.setBackgroundResource(R.drawable.recon);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion != null) {
            grabacion.stop();
            grabacion.release();
            grabacion = null;
            btn_recorder.setBackgroundResource(R.drawable.recof);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducir(View view) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(archivoSalida);
            mediaPlayer.prepare();
        } catch (IOException e) {
        }

        mediaPlayer.start();
        Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();
    }

    public void Repetir(View view) {

            mp.pause();


            if (repetir == 1) {
                btn_repetir.setImageResource(R.drawable.no_repetir);
                repetir = 2;



            } else {
                btn_repetir.setImageResource(R.drawable.repetir);
                repetir = 1;

            }
        }

    public void homeroPlay(View view) {

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.homero);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.homero);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }


    }

        public void bartPlay (View view){

            if(repetir==1) {
                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.bart);
                mp.seekTo(0);
                mp.start();
                mp.setLooping(true);
            }
            if (repetir == 2) {
                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.bart);
                mp.seekTo(0);
                mp.start();
                mp.setLooping(false);
            }
        }
   public void margePlay (View view){

       if(repetir==1) {
           mp.reset();
           mp.release();
           mp = MediaPlayer.create(this, R.raw.marge);
           mp.seekTo(0);
           mp.start();
           mp.setLooping(true);
       }
       if (repetir == 2) {
           mp.reset();
           mp.release();
           mp = MediaPlayer.create(this, R.raw.marge);
           mp.seekTo(0);
           mp.start();
           mp.setLooping(false);
       }
    }
    public void lisaPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.lisa);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.lisa);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void wilyPlay (View view){
        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.wily);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.wily);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void nedPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.flanders);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.flanders);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void moePlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.moe);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.moe);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void burnsPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.burns);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.burns);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void nelsonPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.nelson);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.nelson);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void krustyPlay (View view){
        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.krusty);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.krusty);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void skinnerPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.skinner);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.skinner);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void abrahamPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.abraham);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.abraham);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void toddPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.todd);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.todd);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void milhousePlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.milhouse);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.milhouse);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void apuPlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.apu);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.apu);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }
    public void jefePlay (View view){

        if(repetir==1) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.gorgory);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(true);
        }
        if (repetir == 2) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.gorgory);
            mp.seekTo(0);
            mp.start();
            mp.setLooping(false);
        }
    }


    @Override
    public void onPause() {
        super.onPause();
        mp.pause();

    }

    @Override
    public void onResume() {
        super.onResume();
        mp.start();
    }
    }


