package com.ecalie.android.huit3rium.controleur;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ecalie.android.huit3rium.R;

public class SelectJeuneActivity extends AppCompatActivity {

    private EditText plaque;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_jeune);

        plaque = findViewById(R.id.plaque);
        btnOk = findViewById(R.id.plaque_ok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plaque.getText() != null && plaque.getText().toString().length() >= 2)
                    startActivity(new Intent(SelectJeuneActivity.this, ResultatActivity.class));
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SelectJeuneActivity.this);
                    builder.setTitle("Erreur")
                            .setMessage("Renseigner le numéro de la plaque de cadre")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            })
                            .create()
                            .show();
                }

            }
        });
    }
}
