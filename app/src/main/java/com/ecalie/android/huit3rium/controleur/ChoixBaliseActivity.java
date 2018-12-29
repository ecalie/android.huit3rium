package com.ecalie.android.huit3rium.controleur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.ecalie.android.huit3rium.R;

public class ChoixBaliseActivity extends AppCompatActivity {

    private RadioButton balise1;
    private RadioButton balise2;
    private RadioButton balise3;
    private RadioButton balise4;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_balise);

        balise1 = findViewById(R.id.balise1);
        balise2 = findViewById(R.id.balise2);
        balise3 = findViewById(R.id.balise3);
        balise4 = findViewById(R.id.balise4);
        btnOk = findViewById(R.id.balise_ok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
