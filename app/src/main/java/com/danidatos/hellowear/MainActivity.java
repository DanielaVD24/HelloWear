package com.danidatos.hellowear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edad;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ids();

        botones();
    }

    private void ids() {
        boton = findViewById(R.id.button);
        edad = findViewById(R.id.editTextText);
    }

    private void botones(){
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int textoEdad = Integer.parseInt(edad.getText().toString());
                if(textoEdad > 18 ){
                    Intent pantalla = new Intent(MainActivity.this, SegundaPantalla.class);
                    startActivity(pantalla);
                } else {
                    Toast.makeText(MainActivity.this, "No eres mayor de edad", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}