package com.example.adam.mathlab20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeometriaActivity extends AppCompatActivity {

    private Button przyciskFiguryProste;
    private Button przyciskPlanimetria;
    private Button przyciskStereometria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometria);

        przyciskFiguryProste = (Button) findViewById(R.id.przyciskFiguryProste);
        przyciskFiguryProste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figuryProsteClick();
            }
        });

        przyciskPlanimetria = (Button) findViewById(R.id.przyciskPlanimetria);
        przyciskPlanimetria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planimetriaClick();
            }
        });

        przyciskStereometria = (Button) findViewById(R.id.przyciskStereometria);
        przyciskStereometria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stereometriaClick();
            }
        });
    }

    public void planimetriaClick(){
        Intent intent = new Intent(this, PlanimetriaActivity.class);
        startActivity(intent);
    }

    public void stereometriaClick(){
        Intent intent = new Intent(this, StereometriaActivity.class);
        startActivity(intent);
    }
    public void figuryProsteClick(){
        Intent intent = new Intent(this, FiguryProsteActivity.class);
        startActivity(intent);
    }

}
