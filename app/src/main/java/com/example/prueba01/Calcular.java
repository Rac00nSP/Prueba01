package com.example.prueba01;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular extends AppCompatActivity {
    private EditText producto, Monto;
    private CheckBox check;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);
        producto = (EditText) findViewById(R.id.editTextProducto);Monto = (EditText) findViewById(R.id.editTextMonto);
        check = (CheckBox) findViewById(R.id.checkBoxDomicilio);text = (TextView) findViewById(R.id.textViewTotal);
    }
    public void Calcular(View v){
        int valor;
        int monto;
        String product;
        product = producto.getText().toString().toLowerCase();
        try {
            monto = Integer.parseInt(Monto.getText().toString());}catch (Exception e){
            text.setText("Ingrese monto"); return;
        };
        switch (product){
            case "televisor":
                valor = (check.isChecked()) ? 129000 + 14500 : 129000;
                break;
            case "microondas":
                valor = (check.isChecked()) ? 50000 + 5500 : 50000;
                break;
            case "lavadora":
                valor = (check.isChecked()) ? 100000 + 25000 : 100000;
                break;
            default:
                text.setText("Item no encontrado");
                return;
        }
        if(valor<monto)
            text.setText("Pagado, cambio: $" + String.valueOf(monto - valor));
        else if(valor == monto)
            text.setText("Pagado");
        else
            text.setText("Deuda: $" + String.valueOf(valor - monto));
    }
}
