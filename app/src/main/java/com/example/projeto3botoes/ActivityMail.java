package com.example.projeto3botoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class ActivityMail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
    }
    public void EnviarEmail(View view) {
        EditText End = findViewById(R.id.edtEnd);
        EditText Ass = findViewById(R.id.edtAss);
        EditText Texto = findViewById(R.id.edtTexto);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, End.getText());
        intent.putExtra(Intent.EXTRA_SUBJECT, Ass.getText());
        intent.putExtra(Intent.EXTRA_TEXT, Texto.getText());
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            this.startActivity(intent);
        }
    }
}
