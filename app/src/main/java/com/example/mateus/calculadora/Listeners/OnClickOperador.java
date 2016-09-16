package com.example.mateus.calculadora.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.mateus.calculadora.MainActivity;

/**
 * Created by Mateus on 16/09/2016.
 */
public class OnClickOperador implements View.OnClickListener {

    MainActivity main;

    public OnClickOperador (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        if(main.op.equals("")){
            main.tela += b.getText();
            main.op = (String) b.getText();
            main.updateScreen();

        } else {
            main.tela = String.valueOf(main.result()) + b.getText();
            main.op = (String) b.getText();
            main.updateScreen();
        }

    }
}
