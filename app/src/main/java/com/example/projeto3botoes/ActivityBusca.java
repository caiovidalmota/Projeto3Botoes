package com.example.projeto3botoes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityBusca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
    }

    public void WebPesq(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        EditText edtPesq = findViewById(R.id.edtPesq);
        intent.putExtra(SearchManager.QUERY, edtPesq.getText().toString());
        if (intent.resolveActivity(this.getPackageManager()) != null)
            this.startActivity(intent);
    }
}
