package com.example.ejercicio2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
    }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i("Act1", "onDestroy");

            // Iniciar la segunda actividad al destruir la actual
            Intent ejemplo = new Intent(this, MainActivity.class);
            startActivity(ejemplo);
        }

}