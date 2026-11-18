package com.example.crackme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etKey = findViewById(R.id.etKey);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputKey = etKey.getText().toString();
                if (inputKey.equals("CrackMe")) {
                    Toast.makeText(MainActivity.this, "Đúng", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
