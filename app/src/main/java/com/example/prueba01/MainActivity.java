package com.example.prueba01;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String  android;
    // public int i = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private boolean loginConfirmation(){
        EditText usuario = (EditText) findViewById(R.id.etn);
        EditText password = (EditText) findViewById(R.id.etp);
        return(usuario.getText().toString().equalsIgnoreCase("android") && password.getText().toString().equalsIgnoreCase("123"));
    }
    public void Login (View v){
        if(loginConfirmation()) {
            Intent i = new Intent(this, Opciones.class);
            startActivity(i);
        }
    }
}

