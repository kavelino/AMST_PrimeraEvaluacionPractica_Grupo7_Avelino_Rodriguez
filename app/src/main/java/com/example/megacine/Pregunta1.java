package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Pregunta1 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
    }

    public void c (View view) {
        num++;
        cont--;
        if(cont <= 0){
            Intent intent = new Intent(this,ActividadGanar.class);
            startActivity(intent);
        }
        Random rand= new Random();
        int n= rand.nextInt(4)+1;

        if (n == 1 && cont > 0){
            Intent intent = new Intent(this,Pregunta2.class);
            startActivity(intent);
        }
        else if (n == 2 && cont > 0){
            Intent intent = new Intent(this,Pregunta3.class);
            startActivity(intent);
        }
        else if (n == 3 && cont > 0){
            Intent intent = new Intent(this,Pregunta4.class);
            startActivity(intent);
        }
        else if (n == 4 && cont > 0) {
            Intent intent = new Intent(this, Pregunta5.class);
            startActivity(intent);
        }
    }

    public void i (View view) {
        Intent intent = new Intent(this,ActividadPerder.class);
        startActivity(intent);
    }

}
