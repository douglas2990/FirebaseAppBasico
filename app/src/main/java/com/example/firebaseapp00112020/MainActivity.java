package com.example.firebaseapp00112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private EditText edtNome, edtEmail;
    private Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia.child( "pontos" ).setValue("100");

        edtNome = (EditText)findViewById(R.id.edtNome);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        btnAdicionar = (Button)findViewById(R.id.btnAdicionar);

    }

    public void clique_adicionar(View view) {
        Adicionar();
    }

    public void Adicionar(){


        String usuario = edtNome.getText().toString();
        String email = edtEmail.getText().toString();

        referencia.child("Usuario").setValue(usuario);
        referencia.child("Email").setValue(email);
    }
}