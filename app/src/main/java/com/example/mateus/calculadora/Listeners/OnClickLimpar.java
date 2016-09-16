package com.example.mateus.calculadora.Listeners;

import android.view.View;

import com.example.mateus.calculadora.MainActivity;

/**
 * Created by Mateus on 16/09/2016.
 */
public class OnClickLimpar implements View.OnClickListener {

    MainActivity main;

    public OnClickLimpar(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        main.tela = "";
        main.op = "";
        main.updateScreen();

    }
}
