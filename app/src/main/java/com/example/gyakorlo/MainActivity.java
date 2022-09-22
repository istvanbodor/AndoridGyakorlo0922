package com.example.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText beiros;
    private Button elsogomb;
    private Button masodikgomb;
    private Button harmadikgomb;
    private TextView megnezos;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        elsogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                megnezos.setText(beiros.getText().toString().toUpperCase(Locale.ROOT));
            }
        });

        masodikgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                megnezos.setText(beiros.getText().toString().toLowerCase(Locale.ROOT));
            }
        });



    }

    private void init()
    {
        beiros = findViewById(R.id.beiros);
        elsogomb = findViewById(R.id.elsogomb);
        masodikgomb = findViewById(R.id.masodikgomb);
        harmadikgomb = findViewById(R.id.harmdikgomb);
        megnezos = findViewById(R.id.megnezos);

    }


}