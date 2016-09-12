package com.example.mateus.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1;
    EditText n2;
    int result;
    Button btSomar;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        btSomar = (Button) findViewById(R.id.btSomar);
        resultado = (TextView) findViewById(R.id.resultado);

        btSomar.setOnClickListener(this);
    }
        public void onClick(View v){
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());

            result = (num1 + num2);

            resultado.setText(num1 + " + " + num2 + " = " + result);

        }




}


