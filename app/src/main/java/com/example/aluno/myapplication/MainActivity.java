package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTela1 = (Button) findViewById(R.id.buttonTela1);

        buttonTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // o que fazer quando clicar neste botao

                startActivity( new Intent(MainActivity.this, Tela2Activity.class));


            }
        });
    }
}
