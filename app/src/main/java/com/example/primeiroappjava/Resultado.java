package com.example.primeiroappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    // Declara os objetos que serao associados aos elementos de tela
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Associa os objetos aos elementos de tela
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        //Declara o objeto que receberá o agenciador de atividade
        Intent i = getIntent();
        //Lê o parametro que foi passado na tela anterior
        float media = i.getFloatExtra("media", 0f);
        //Define o que sera apresentado ao usuario
        String situacao= null;
        if(media <=6)
            situacao = "Aprovado";
        else
            situacao = "Reprovado";
        String mag= "Você foi" + situacao + "com média" + media;
        //copia a menssagem que sera mostrada ao usuario para o campo tvResultado
        tvResultado.setText(mag);



    }
}