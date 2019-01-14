package com.example.adam.mathlab20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FunkcjaLogarytmicznaActivity extends AppCompatActivity {

    public Button przyciskLogarytmiczy1;
    public Button przyciskLogarytmiczy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkcja_logarytmiczna);
    }

    public void onClick(View view){
        przyciskLogarytmiczy1 = (Button) findViewById(R.id.przyciskLogarytmiczy1);
        przyciskLogarytmiczy2 = (Button) findViewById(R.id.przyciskLogarytmiczy2);
        if (view == przyciskLogarytmiczy1) wykresWiekszy(view);
        if (view == przyciskLogarytmiczy2) wykresMniejszy(view);

    }

    public void wykresWiekszy(View view){
        setContentView(R.layout.activity_wykres_wiekszy);
    }

    public void wykresMniejszy(View view){
        setContentView(R.layout.activity_wykres_mniejszy);
    }

    public void returnClick(View view) {
        setContentView(R.layout.activity_funkcja_logarytmiczna);
    }

}
