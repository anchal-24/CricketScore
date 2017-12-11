package com.example.anchalshukla.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView r = (TextView) findViewById(R.id.textView18);
        r.setText(String.valueOf(((MyApplication) this.getApplication()).runs[0]));

        r = (TextView) findViewById(R.id.textView19);
        r.setText(String.valueOf(((MyApplication) this.getApplication()).runs[1]));

        r = (TextView) findViewById(R.id.textView20);
        r.setText(String.valueOf(((MyApplication) this.getApplication()).runs[2]));

        r = (TextView) findViewById(R.id.textView21);
        r.setText(String.valueOf(((MyApplication) this.getApplication()).runs[3]));

        r = (TextView) findViewById(R.id.textView22);
        r.setText(String.valueOf(((MyApplication) this.getApplication()).runs[4]));

    }
}
