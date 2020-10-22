package com.example.prueba01;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_opciones);
    }
    public void productos(View v)
    {
        Intent pasar = new Intent(this, Calcular.class);
        startActivity(pasar); //inicia activity
    }
    public void Cliente(View v)
    {
        Intent pasar = new Intent(this, Cliente.class);
        startActivity(pasar); //inicia activity
    }
    public void Cardview(View v)
    {
        Intent pasar = new Intent(this, Cardview.class);
        startActivity(pasar); //inicia activity
    }
    public void Comentarios(View v)
    {
        Intent pasar = new Intent(this, Comentarios.class);
        startActivity(pasar); //inicia activity
    }

}
