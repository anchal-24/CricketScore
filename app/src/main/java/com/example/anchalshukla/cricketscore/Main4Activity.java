package com.example.anchalshukla.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        int i;
        int ar[][]={{0,0},{0,0}};
int ctr[]={0,0};
        for(int j=0;j<2;j++){
            int temp=((MyApplication) this.getApplication()).runs[0];

        for(i=1;i<((MyApplication) this.getApplication()).n;i++) {
            if (((MyApplication) this.getApplication()).runs[i] > temp) {
if(i!=(ctr[0])) {
    temp = ((MyApplication) this.getApplication()).runs[i];
    ctr[j]=i;
}
            } }
        ar[j][0]=temp;
    ar[j][1]=((MyApplication) this.getApplication()).balls[i];

        }


        TextView r = (TextView) findViewById(R.id.textView7);
        r.setText(String.valueOf(ar[0][0]));
        r = (TextView) findViewById(R.id.textView9);
        r.setText(String.valueOf(ar[0][1]));
        r = (TextView) findViewById(R.id.textView11);
        r.setText(String.valueOf(ar[1][0]));
        r = (TextView) findViewById(R.id.textView13);
        r.setText(String.valueOf(ar[1][1]));
        r = (TextView) findViewById(R.id.textView13);
        r.setText(String.valueOf(ctr[0]));
        r = (TextView) findViewById(R.id.textView13);
        r.setText(String.valueOf(ctr[1]));
    }}

