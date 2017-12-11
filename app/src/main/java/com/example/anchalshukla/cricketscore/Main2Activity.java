package com.example.anchalshukla.cricketscore;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import android.widget.Spinner;



public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ((MyApplication) this.getApplication()).n=0;
        ((MyApplication) this.getApplication()).o=0.0;
        ((MyApplication) this.getApplication()).tn="Null";

      /*Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.no_p, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        String text = spinner.getSelectedItem().toString();
        n=Integer.parseInt(text);
*/


}


public void B1(View view)
{((MyApplication) this.getApplication()).i=-1;
    EditText editText = (EditText) findViewById(R.id.Team_Name);
    ((MyApplication) this.getApplication()).tn = editText.getText().toString();
    editText = (EditText) findViewById(R.id.Player_no);
    ((MyApplication) this.getApplication()).n = Integer.parseInt(editText.getText().toString());



//    editText = (EditText) findViewById(R.id.Overs);
   // ((MyApplication) this.getApplication()).o = Double.parseDouble(editText.getText().toString());
Intent intent = new Intent(this, MainActivity.class);

    startActivity(intent);





}

public void B2(View view)
{
    finish();
    Intent intent = getIntent();
    startActivity(intent);}
}
