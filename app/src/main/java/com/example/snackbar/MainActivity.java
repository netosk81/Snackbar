package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbrir;
    private Button buttonFechar;

    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);
        buttonFechar =findViewById(R.id.buttonFechar);

        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Snackbar.make(
                        view,
                        "Botão clicado",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                buttonAbrir.setText("Botao abrir alterado");
                            }
                        }).setActionTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_secondary))
                       .show();
                /*snackbar = Snackbar.make(
                        view,
                        "Botão clicado",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonAbrir.setText("Botao abrir alterado");
                    }
                });

                snackbar.show();*/
            }
        });
        /*buttonFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });*/
    }
    public void abrirSnackbar(View view){

    }
}