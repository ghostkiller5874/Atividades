package com.example.test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txtResult = findViewById(R.id.txtResult);

    }

    public void Somar(View view){
        Double v1 = Double.parseDouble(edt1.getText().toString());
        Double v2 = Double.parseDouble(edt2.getText().toString());

        Double result = v1 + v2;

        txtResult.setText(""+result);
    }
} 