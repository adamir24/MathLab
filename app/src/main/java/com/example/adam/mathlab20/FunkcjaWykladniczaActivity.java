package com.example.adam.mathlab20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FunkcjaWykladniczaActivity extends AppCompatActivity {

    public Button przyciskWykresWiekszy;
    public Button przyciskWykresMniejszy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkcja_wykladnicza);
    }

    public void onClickWykladnicza(View view){
        przyciskWykresMniejszy = (Button) findViewById(R.id.przyciskWykres2);
        przyciskWykresWiekszy = (Button) findViewById(R.id.przyciskWykres1);
        if (view == przyciskWykresMniejszy) wykresMniejszyClick(view);
        if (view == przyciskWykresWiekszy) wykresWiekszyClick(view);
    }

    public void wykresMniejszyClick(View view){
        setContentView(R.layout.activity_wykres_wykladniczy_m);
    }

    public void wykresWiekszyClick(View view){
        setContentView(R.layout.activity_wykres_wykladniczy_w);
    }

    public void returnClick(View view){
        setContentView(R.layout.activity_funkcja_wykladnicza);
    }
}
