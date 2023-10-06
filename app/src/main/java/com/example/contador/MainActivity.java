package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Omar García Moreno", Toast.LENGTH_SHORT).show();;
        contador=0;
    }

    public void incremetaContador(View vista){
        contador++;

        mostrarResultado();
    }

    public void decremetaContador(View vista){
        contador--;

        mostrarResultado();
    }

    public void reseteaContador(View vista){
        contador=0;

        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado=(TextView)findViewById(R.id.contadorTexto);
        textoResultado.setText("" + contador);
    }

}