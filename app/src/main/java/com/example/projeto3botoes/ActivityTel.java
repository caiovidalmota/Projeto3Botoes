package com.example.projeto3botoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class ActivityTel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        }

    public void startCall(View view) {
        EditText editText1 = findViewById(R.id.edtNumero);
        String num = editText1.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + num));
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            this.startActivity(intent);
        }
    }

}