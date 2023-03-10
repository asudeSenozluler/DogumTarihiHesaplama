package com.example.dogumtarihi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txtAd, txtSoyad, txtDyili;
    TextView lblSonuc;
    Button btnGiris;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAd=(EditText) findViewById(R.id.txtAd);
        txtSoyad=(EditText) findViewById(R.id.txtSoyad);
        txtDyili=(EditText) findViewById(R.id.txtdyili);
        lblSonuc=(TextView) findViewById(R.id.lblSonuc);
        btnGiris=(Button) findViewById(R.id.btnGiris);
        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txtAd.getText().toString()+" "+txtSoyad.getText().toString();
                int yas=2023- Integer.parseInt(txtDyili.getText().toString());
                str+=" "+String.valueOf(yas);
                lblSonuc.setText(str);
            }
        });
    }
}