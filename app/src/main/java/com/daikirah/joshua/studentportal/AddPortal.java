package com.daikirah.joshua.studentportal;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPortal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);

        final EditText editTextUrl = findViewById(R.id.add_url);
        final EditText editTextTitle = findViewById(R.id.add_title);
        Button button = findViewById(R.id.add_portal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editTextUrl.getText().toString().equals("") && !editTextTitle.getText().toString().equals("")){
                    Intent data = new Intent();
                    String[]x  = {editTextUrl.getText().toString(), editTextTitle.getText().toString()};
                    data.putExtra("portal", x);
                    setResult(Activity.RESULT_OK, data);
                    finish();
                }

                else {
                    Snackbar.make(view, "Enter valid values for URL and Title!", Snackbar.LENGTH_LONG).show();
                }

            }
        });

    }
}
