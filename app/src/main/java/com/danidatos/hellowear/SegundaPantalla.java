package com.danidatos.hellowear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaPantalla extends AppCompatActivity {
    EditText edMaria;
    Button volver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_pantalla);

        ids();
        botones();
    }

    private void ids() {
        edMaria = findViewById(R.id.edMaria);
        volver = findViewById(R.id.btnVolver);
    }

    private void botones(){
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edMaria.getText().toString().equals("maria")){
                    Intent pantalla2 = new Intent(SegundaPantalla.this, MainActivity.class);
                    startActivity(pantalla2);
                } else {
                    Toast.makeText(SegundaPantalla.this, "pon maria correctamente", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
