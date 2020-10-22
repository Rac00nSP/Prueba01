package com.example.prueba01;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.HashMap;

public class Cliente extends AppCompatActivity {
    private Spinner spiner;
    private EditText productor;
    private TextView saldos;
    private HashMap<String,Integer> productos = new HashMap<>();
    private int saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        spiner =  (Spinner)findViewById(R.id.spinnerClientes);
        productor = (EditText) findViewById(R.id.editTextProducto);
        saldos = (TextView) findViewById(R.id.textViewSaldo);
        String [] clientes = {"Mario","Constanza","Fernanda"};
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,clientes);spiner.setAdapter(adapt);
        productos.put("horno",45000);
        productos.put("espejo",100000);
        productos.put("sillas",80000);
    }
    public void Calcular(View view){String producto = productor.getText().toString().toLowerCase();
        if(productos.containsKey(producto)){
            switch (spiner.getSelectedItemPosition()){
                case 0:
                    saldo = 500000 + productos.get(producto);
                    break;
                case 1:
                    saldo = 320000 + productos.get(producto);
                    break;
                case 2:
                    saldo = 120000 + productos.get(producto);
                    break;
            }
            saldos.setText("Saldo final:" + String.valueOf(saldo));
        }
        else{
            saldos.setText("Ingrese producto correctamente");
        }

    }
}
