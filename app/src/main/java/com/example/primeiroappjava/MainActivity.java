package com.example.primeiroappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<plublic> extends AppCompatActivity {
    //declara os objetos que identificam os campos de tela
    EditText idNota1;
    EditText idNota2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os elementos de tela aos objetos declarados
        EditText idNota1= (EditText) findViewById(R.id.idNota1);
        EditText idNota2= (EditText) findViewById(R.id.idNota2);
    }
    public void calcularMedia(View v){
        //declara as variaveis que farao o calculo da media
        float nota1 = Float.parseFloat(idNota1.getText().toString());
        float nota2 = Float.parseFloat(idNota2.getText().toString());

        float media = (nota1+nota2) / 2; // calcula a média

        // Declara o controle Intent que será usado para identificar a proxima tela
        Intent i = new Intent (this, Resultado.class);
        //Insere um parametro para ser usado na proxima tela
        i.putExtra("media", media);
        // chama a proxima tela
        startActivity(i);
    }



}


//= (EditText) findViewById(R.id.idNota1);