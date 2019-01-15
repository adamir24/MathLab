package com.example.adam.mathlab20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FunkcjeActivity extends AppCompatActivity {


    public Button przyciskFunkcjaKwadratowa;
    public Button przyciskFuncjaLiniowa;
    public Button przyciskFunkcjaLogarytmiczna;
    public Button przyciskFunkcjaWymierna;
    public Button przyciskFunkcjaWykladnicza;
    public Button przyciskTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkcje);

        przyciskFuncjaLiniowa = (Button) findViewById(R.id.przyciskFunkcjaLiniowa);
        przyciskFuncjaLiniowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFuncjaLiniowaClick();
            }
        });

        przyciskFunkcjaKwadratowa = (Button) findViewById(R.id.przyciskFunkcjaKwadratowa);
        przyciskFunkcjaKwadratowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFunkcjaKwadratowaClick();
            }
        });

        przyciskFunkcjaLogarytmiczna = (Button) findViewById(R.id.przyciskFunkcjaLogarytmiczna);
        przyciskFunkcjaLogarytmiczna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFunkcjaLogarytmicznaClick();
            }
        });

        przyciskFunkcjaWymierna = (Button) findViewById(R.id.przyciskFunkcjaWymierna);
        przyciskFunkcjaWymierna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFunkcjaWymiernaClick();
            }
        });

        przyciskFunkcjaWykladnicza = (Button) findViewById(R.id.przyciskFunkcjaWykladnicza);
        przyciskFunkcjaWykladnicza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFunkcjaWykladniczaClick();
            }
        });

        przyciskTest = (Button) findViewById(R.id.przyciskTest);
        przyciskTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskTestClick();
            }
        });

    }


    public void przyciskFunkcjaKwadratowaClick() {
        Intent intent = new Intent(this, FunkcjaKwadratowaActivity.class);
        startActivity(intent);
    }

    public void przyciskFuncjaLiniowaClick() {
        Intent intent = new Intent(this, FuncjaLiniowaActivity.class);
        startActivity(intent);
    }

    public void przyciskFunkcjaLogarytmicznaClick() {
        Intent intent = new Intent(this, FunkcjaLogarytmicznaActivity.class);
        startActivity(intent);
    }

    public void przyciskFunkcjaWymiernaClick() {
        Intent intent = new Intent(this, FunkcjaWymiernaActivity.class);
        startActivity(intent);
    }

    public void przyciskFunkcjaWykladniczaClick() {
        Intent intent = new Intent(this, FunkcjaWykladniczaActivity.class);
        startActivity(intent);
    }

    public void przyciskTestClick() {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }
}
