package com.example.adam.mathlab20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatematykaActivity extends AppCompatActivity {

    private Button przyciskFunkcje;
    private Button przyciskGeometria;
    private Button przyciskWielomiany;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematyka);

        przyciskFunkcje = (Button) findViewById(R.id.przyciskFunkcje);
        przyciskFunkcje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFunkcjeClick();
            }
        });

        przyciskGeometria = (Button) findViewById(R.id.przyciskGeometria);
        przyciskGeometria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskGeometriaClick();
            }
        });

        przyciskWielomiany = (Button) findViewById(R.id.przyciskWielomiany);
        przyciskWielomiany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskWielomianyClick();
            }
        });

    }

    public void przyciskFunkcjeClick(){
        Intent intent = new Intent(this, FunkcjeActivity.class);
        startActivity(intent);
    }

    public void przyciskGeometriaClick(){
        Intent intent = new Intent(this, GeometriaActivity.class);
        startActivity(intent);
    }

    public void przyciskWielomianyClick(){
        Intent intent = new Intent(this, WielomianyActivity.class);
        startActivity(intent);
    }
}
