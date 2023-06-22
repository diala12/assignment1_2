package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton dama;
    private ImageButton ball;
    private ImageButton nail;
    private ImageButton orga;
    private ImageButton moltawyeh;
    TextView cancel_text;
    TextView info;
    ImageView imageview;
    Animation rotateAnimation;
    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "BacteriaInfo";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.animation);

        DAbacteria bacterias = new DAbacteria();

        Dialog dialog = new Dialog(MainActivity.this);
        dama = findViewById(R.id.dama);
        ball = findViewById(R.id.ball);
        nail = findViewById(R.id.nail);
        orga = findViewById(R.id.orga);
        moltawyeh = findViewById(R.id.moltawyeh);

        dama.startAnimation(rotateAnimation);
        ball.startAnimation(rotateAnimation);
        nail.startAnimation(rotateAnimation);
        orga.startAnimation(rotateAnimation);
        moltawyeh.startAnimation(rotateAnimation);

        ball.setTransitionName("ball");
        moltawyeh.setTransitionName("moltawyeh");
        dama.setTransitionName("dama");
        nail.setTransitionName("nail");
        orga.setTransitionName("orga");

        sharedPreferences = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        dama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                String bacteriaName = dama.getTransitionName();
                String bacteriaInfo = getBacteriaInformation(bacteriaName);
                if (bacteriaInfo.isEmpty()) {
                    bacteriaInfo = bacterias.getbacteriaByname(bacteriaName).getInformation();
                    saveBacteriaInformation(bacteriaName, bacteriaInfo);
                }
                info.setText(bacteriaInfo);
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                String bacteriaName = ball.getTransitionName();
                String bacteriaInfo = getBacteriaInformation(bacteriaName);
                if (bacteriaInfo.isEmpty()) {
                    bacteriaInfo = bacterias.getbacteriaByname(bacteriaName).getInformation();
                    saveBacteriaInformation(bacteriaName, bacteriaInfo);
                }
                info.setText(bacteriaInfo);
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });

        orga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                String bacteriaName = orga.getTransitionName();
                String bacteriaInfo = getBacteriaInformation(bacteriaName);
                if (bacteriaInfo.isEmpty()) {
                    bacteriaInfo = bacterias.getbacteriaByname(bacteriaName).getInformation();
                    saveBacteriaInformation(bacteriaName, bacteriaInfo);
                }
                info.setText(bacteriaInfo);
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });

        moltawyeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                String bacteriaName = moltawyeh.getTransitionName();
                String bacteriaInfo = getBacteriaInformation(bacteriaName);
                if (bacteriaInfo.isEmpty()) {
                    bacteriaInfo = bacterias.getbacteriaByname(bacteriaName).getInformation();
                    saveBacteriaInformation(bacteriaName, bacteriaInfo);
                }
                info.setText(bacteriaInfo);
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });

        nail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                String bacteriaName = nail.getTransitionName();
                String bacteriaInfo = getBacteriaInformation(bacteriaName);
                if (bacteriaInfo.isEmpty()) {
                    bacteriaInfo = bacterias.getbacteriaByname(bacteriaName).getInformation();
                    saveBacteriaInformation(bacteriaName, bacteriaInfo);
                }
                info.setText(bacteriaInfo);
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });
    }

    private String getBacteriaInformation(String bacteriaName) {
        return sharedPreferences.getString(bacteriaName, "");
    }

    private void saveBacteriaInformation(String bacteriaName, String information) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(bacteriaName, information);
        editor.apply();
    }
}
