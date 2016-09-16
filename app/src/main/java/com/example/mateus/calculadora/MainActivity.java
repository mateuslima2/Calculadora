package com.example.mateus.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mateus.calculadora.Listeners.OnClickIgual;
import com.example.mateus.calculadora.Listeners.OnClickNumber;
import com.example.mateus.calculadora.Listeners.OnClickOperador;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView screen;
    public String tela = "";
    public String op = "";
    public Double number;

    int result;
    Button btMais;
    Button btIgual;
    Button btMenos;
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button btLimpa;
    Button btMult;
    Button btDiv;
    Button btPnt;
    EditText etNumber1;
    EditText etNumber2;
    TextView tvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.screen);
        updateScreen();

        btDiv = (Button) findViewById(R.id.btDiv);
        btMult = (Button) findViewById(R.id.btMult);
        btMais = (Button) findViewById(R.id.btMais);
        btMenos = (Button) findViewById(R.id.btMenos);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btLimpa = (Button) findViewById(R.id.btLimpa);
        btPnt = (Button) findViewById(R.id.btPnt);
        btIgual = (Button) findViewById(R.id.btIgual);



        bt0.setOnClickListener(new OnClickNumber(this));
        bt1.setOnClickListener(new OnClickNumber(this));
        bt2.setOnClickListener(new OnClickNumber(this));
        bt3.setOnClickListener(new OnClickNumber(this));
        bt4.setOnClickListener(new OnClickNumber(this));
        bt5.setOnClickListener(new OnClickNumber(this));
        bt6.setOnClickListener(new OnClickNumber(this));
        bt7.setOnClickListener(new OnClickNumber(this));
        bt8.setOnClickListener(new OnClickNumber(this));
        bt9.setOnClickListener(new OnClickNumber(this));
        btPnt.setOnClickListener(new OnClickNumber(this));

        btDiv.setOnClickListener(new OnClickOperador(this));
        btMult.setOnClickListener(new OnClickOperador(this));
        btMenos.setOnClickListener(new OnClickOperador(this));
        btMais.setOnClickListener(new OnClickOperador(this));
        btIgual.setOnClickListener(new OnClickIgual(this));

    }

    public void updateScreen() {
        screen.setText(tela);
    }

    public double result() {
        String[] numbers=tela.split(Pattern.quote(op));

        if (numbers.length==1) {
            return Double.parseDouble(numbers[0]);
        } else {

            switch(op) {
                case "+":

                    return Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                case "-":

                    return Double.parseDouble(numbers[0])-Double.parseDouble(numbers[1]);
                case "/":

                    return Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                case "*":

                    return Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                default:

                    return 0;
            }
        }
    }



}


