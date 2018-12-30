package com.ecalie.android.huit3rium.controleur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import com.ecalie.android.huit3rium.R;

public class ResultatActivity extends AppCompatActivity {

    private Switch zone1;
    private Switch zone2;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        zone1 = findViewById(R.id.zone1);
        zone2 = findViewById(R.id.zone2);
        btnOk = findViewById(R.id.resultat_ok);
    }
}
