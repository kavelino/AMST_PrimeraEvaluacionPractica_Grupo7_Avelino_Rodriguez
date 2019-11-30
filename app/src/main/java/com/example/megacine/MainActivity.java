package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btnEmpezar;
    public int num = 0;
    public int cont = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpezar = (Button)findViewById(R.id.btnEmpezar);
    }

    public void empezarTrivia(View view) {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        if (n == 1) {
            Intent intent = new Intent(this, Pregunta1.class);
            startActivity(intent);
        }

        else if (n == 2) {
            Intent intent = new Intent(this, Pregunta2.class);
            startActivity(intent);
        }

        else if (n == 3) {
            Intent intent = new Intent(this, Pregunta3.class);
            startActivity(intent);
        }

        else if (n == 4) {
            Intent intent = new Intent(this, Pregunta4.class);
            startActivity(intent);
        }

        else {
            Intent intent = new Intent(this, Pregunta5.class);
            startActivity(intent);
        }
    }
}
