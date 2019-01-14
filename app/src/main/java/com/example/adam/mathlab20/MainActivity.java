package com.example.adam.mathlab20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button przyciskMatematyka;
    private Button przyciskFizyka;
    private Button przyciskInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przyciskInfo = (Button) findViewById(R.id.przyciskInfo);
        przyciskInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskInfoClick();
            }
        });

        przyciskFizyka = (Button) findViewById(R.id.przyciskFizyka);
        przyciskFizyka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskFizykaClick();
            }
        });


        przyciskMatematyka = (Button) findViewById(R.id.przyciskMateamatyka);
        przyciskMatematyka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przyciskMatematykaClick();
            }
        });

    }
    public void przyciskInfoClick(){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void przyciskFizykaClick(){
        Intent intent = new Intent(this, FizykaActivity.class);
        startActivity(intent);
    }

    public void przyciskMatematykaClick(){
        Intent intent = new Intent(this, MatematykaActivity.class);
        startActivity(intent);
    }
}
