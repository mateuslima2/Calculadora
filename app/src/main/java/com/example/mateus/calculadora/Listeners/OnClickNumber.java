package com.example.mateus.calculadora.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.mateus.calculadora.MainActivity;

/**
 * Created by Mateus on 16/09/2016.
 */
public class OnClickNumber implements View.OnClickListener {

    MainActivity main;

    public OnClickNumber(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        main.tela += b.getText();
        main.updateScreen();
    }

}
