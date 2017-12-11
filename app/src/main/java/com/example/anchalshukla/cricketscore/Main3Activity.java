package com.example.anchalshukla.cricketscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }

    public void B2(View view)
    {((MyApplication) this.getApplication()).i++;
        int h=((MyApplication) this.getApplication()).i;
        //EditText editText = (EditText) findViewById(R.id.Player_Name);
        //((MyApplication) this.getApplication()).pl_[0][h] = editText.getText().toString();
        //editText = (EditText) findViewById(R.id.Player_Age);
        //((MyApplication) this.getApplication()).pl_[1][h] = editText.getText().toString();
        //editText = (EditText) findViewById(R.id.Player_Type);
        //((MyApplication) this.getApplication()).pl_[2][h] = editText.getText().toString();

        finish();
        if(h<((MyApplication) this.getApplication()).n-1)
        {
            startActivity(getIntent());

      }
    }


}
