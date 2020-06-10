package com.example.projeto3botoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrTel(View view){
        Intent Tel = new Intent(this, ActivityTel.class);
        startActivity(Tel);
    }

    public void IrMail(View view){
        Intent Mail = new Intent(this, ActivityMail.class);
        startActivity(Mail);
    }

    public void IrBusca(View view){
        Intent Busca = new Intent(this, ActivityMail.class);
        startActivity(Busca);
    }
}

