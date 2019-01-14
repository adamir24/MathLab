package com.example.adam.mathlab20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void changeText(View view) {
        Button button = (Button)findViewById(R.id.button2);
        EditText editText = (EditText)findViewById(R.id.editText);
        String myText = editText.getText().toString();
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(myText);

    }
}
