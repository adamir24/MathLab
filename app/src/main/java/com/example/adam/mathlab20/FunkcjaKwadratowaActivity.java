package com.example.adam.mathlab20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class FunkcjaKwadratowaActivity extends AppCompatActivity {

    public Button przyciskObliczWierzcholkiKwadratowe;
    public Button przyciskObliczMiejsceZeroweKwadratowe;
    public EditText poleTekstoweAKwadratowe;
    public EditText poleTekstoweBKwadratowe;
    public EditText poleTekstoweCKwadratowe;
    public TextView textWynikKwadratowy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkcja_kwadratowa);
    }

    public void onClick(View view){

        przyciskObliczMiejsceZeroweKwadratowe = (Button)findViewById(R.id.przyciskObliczMiejsceZeroweKwadratowe);
        przyciskObliczWierzcholkiKwadratowe = (Button) findViewById(R.id.przyciskObliczWierzchołkiKwadratowe);
        poleTekstoweAKwadratowe = (EditText) findViewById(R.id.poleTekstoweAKwadratowe);
        poleTekstoweBKwadratowe = (EditText) findViewById(R.id.poleTekstoweBKwadratowe);
        poleTekstoweCKwadratowe = (EditText) findViewById(R.id.poleTekstoweCKwadratowe);

        if(view == przyciskObliczMiejsceZeroweKwadratowe) ObliczMiejsceZerowe();

        if(view == przyciskObliczWierzcholkiKwadratowe) ObliczWierzchołki();
    }

    public void ObliczMiejsceZerowe(){

        double a;
        double b;
        double c;
        double delta;
        double sqrtDelta;
        double x1;
        double x2;
        String x1text;
        String x2text;

        a = Double.parseDouble(poleTekstoweAKwadratowe.getText().toString());
        b = Double.parseDouble(poleTekstoweBKwadratowe.getText().toString());
        c = Double.parseDouble(poleTekstoweCKwadratowe.getText().toString());

        delta = b*b -4*a*c;
        sqrtDelta = sqrt(delta);

        x1 = (-b - sqrtDelta)/2*a;
        x2 = (-b + sqrtDelta)/2*a;

        x1text = String.valueOf(x1);
        x2text = String.valueOf(x2);

        textWynikKwadratowy2 = (TextView) findViewById(R.id.textWynik2);
        textWynikKwadratowy2.setText("x1= "+ x1text + " x2= " + x2text);
    }

    public void ObliczWierzchołki(){

        double a;
        double b;
        double c;
        double delta;
        double p;
        double q;
        String pText;
        String qText;

        a = Double.parseDouble(poleTekstoweAKwadratowe.getText().toString());
        b = Double.parseDouble(poleTekstoweBKwadratowe.getText().toString());
        c = Double.parseDouble(poleTekstoweCKwadratowe.getText().toString());

        delta = b*b -4*a*c;

        p = -b/2*a;
        q= -delta/4*a;

        pText = String.valueOf(p);
        qText = String.valueOf(q);

        textWynikKwadratowy2 = (TextView) findViewById(R.id.textWynik2);
        textWynikKwadratowy2.setText("p= "+ pText + " q= " + qText);
    }

}