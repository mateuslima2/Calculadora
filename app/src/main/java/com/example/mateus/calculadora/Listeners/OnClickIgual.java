package com.example.mateus.calculadora.Listeners;

import android.view.View;

import com.example.mateus.calculadora.MainActivity;

/**
 * Created by Mateus on 16/09/2016.
 */
public class OnClickIgual  implements View.OnClickListener  {

    MainActivity main;

    public OnClickIgual (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {

        main.screen.setText( String.valueOf (main.result()) );

    }
}
