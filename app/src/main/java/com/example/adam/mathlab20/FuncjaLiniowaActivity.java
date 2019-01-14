package com.example.adam.mathlab20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuncjaLiniowaActivity extends AppCompatActivity {


    public EditText wspolczynnikA;
    public EditText wspolczynnikB;
    public EditText miejsceZerowe;
    public TextView textWynik;
    public Button obliczWspolczynnikA;
    public Button obliczWspolczynnikB;
    public Button obliczMiejsceZerowe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcja_liniowa);
    }

    public void onClick(View view){
        wspolczynnikA = (EditText) findViewById(R.id.poleTekstoweA);
        wspolczynnikB = (EditText) findViewById(R.id.poleTekstoweB);
        miejsceZerowe = (EditText) findViewById(R.id.poleMiejsceZerowe);
        obliczWspolczynnikA = (Button) findViewById(R.id.przyciskObliczA);
        obliczWspolczynnikB = (Button) findViewById(R.id.przyciskObliczB);
        obliczMiejsceZerowe = (Button) findViewById(R.id.przyciskObliczMiejsceZerowe);

        if (view == obliczWspolczynnikA) obliczWspolczynnikAClick();

        if (view == obliczWspolczynnikB) obliczWspolczynnikBClick();

        if (view == obliczMiejsceZerowe) obliczMiejsceZeroweClick();
    }

    public void obliczWspolczynnikAClick(){

        textWynik = (TextView) findViewById(R.id.textWynik);

        float b;
        float mz;
        float a;

        b = Float.parseFloat(wspolczynnikB.getText().toString());
        mz = Float.parseFloat(miejsceZerowe.getText().toString());

        a = -b/mz;

        String wynik = String.valueOf(a);

        textWynik.setText(wynik);

    }

    public void obliczWspolczynnikBClick(){

        textWynik = (TextView) findViewById(R.id.textWynik);

        float a;
        float mz;
        float b;

        a = Float.parseFloat(wspolczynnikA.getText().toString());
        mz = Float.parseFloat(miejsceZerowe.getText().toString());

        b=-(mz*a);

        String wynik = String.valueOf(b);

        textWynik.setText(wynik);

    }

    public void obliczMiejsceZeroweClick(){

        textWynik = (TextView) findViewById(R.id.textWynik);

        float a;
        float b;
        float mz;

        a = Float.parseFloat(wspolczynnikA.getText().toString());
        b = Float.parseFloat(wspolczynnikB.getText().toString());

        mz = -b/a;

        String wynik = String.valueOf(mz);

        textWynik.setText(wynik);

    }
}
