package com.example.duolibras;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.widget.Toast;

public class Prim_questao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prim_questao);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    *public void clique_quest_2(View v) {
        Intent tela = new Intent(this, questao_2.class);
        startActivity(tela);


    }

    /*public void clique_coret(View v) {
        Intent tela = new Intent(this, questao_2.class);
        startActivity(tela);
        alert("Alternativa Correta");

    }

    public void clique_nao_coret(View v) {
        Intent tela = new Intent(this, questao_2.class);
        startActivity(tela);
        alert("Alternativa Correta");

    }*/

}
