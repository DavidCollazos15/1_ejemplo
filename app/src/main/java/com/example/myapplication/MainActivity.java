package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ageEdit = findViewById(R.id.age_edit);
        TextView resultText = findViewById(R.id.result_set);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toma el texto escrito en EditText
                String age = ageEdit.getText().toString();
                Log.d("MiEtiqueta","Estoy en onclick");

                if (!age.isEmpty()) {
                    // Para las operaciones matemáticas necesitaremos un entero
                    int ageInt = Integer.parseInt(age);
                    int result = ageInt * 7;
                    String resultString = "Si fueras un perro, tu edad sería de: " + result + " años";

                    Log.d("MiEtiqueta","Estoy cotejando edad");

                    // Mostrar el resultado en un TextView
                    resultText.setText(resultString);
                } else {
                    // Manejar el caso en el que no se haya ingresado una edad
                    resultText.setText("Por favor, ingresa tu edad");
                }
            }
        });
    }
}
