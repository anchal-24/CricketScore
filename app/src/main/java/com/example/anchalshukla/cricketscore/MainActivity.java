package com.example.anchalshukla.cricketscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

int runs=0;
int wickets=0;
double overs=0.0;
    int cp1=0;
    int cpr1=1;
    int nxt=cpr1+1;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView r = (TextView) findViewById(R.id.Runs);
        r.setText(String.valueOf(runs));
        r = (TextView) findViewById(R.id.Wickets);
        r.setText(String.valueOf(wickets));
        r = (TextView) findViewById(R.id.Overs);
        r.setText(String.valueOf(overs));
for(int q=0;q<((MyApplication) this.getApplication()).n;q++)
{
    ((MyApplication) this.getApplication()).runs[q]=0;
    ((MyApplication) this.getApplication()).balls[q]=0;
}



    r = (TextView) findViewById(R.id.MESSAGE);
    r.setText(String.valueOf("Match is in progress"));
cp1=0;
cpr1=1;
nxt=cpr1+1;
    }
    public void b1(View view) {
if(wickets<((MyApplication) this.getApplication()).n-1) {

    ((MyApplication) this.getApplication()).runs[cp1]++;
    ((MyApplication) this.getApplication()).balls[cp1]++;
    runs = runs + 1;
    cp1 = cpr1 + cp1;
    cpr1 = cp1 - cpr1;
    cp1 = cp1 - cpr1;

    TextView r = (TextView) findViewById(R.id.Runs);
    r.setText(String.valueOf(runs));
    if (overs - Math.floor(overs) == 0.5) {
        overs = ((overs * 10) + 5) / 10;
    } else {
        overs = ((overs * 10) + 1) / 10;
    }


    r = (TextView) findViewById(R.id.Overs);
    r.setText(String.valueOf(overs));
}   }

    public void b2(View view) {
        if (wickets < ((MyApplication) this.getApplication()).n - 1) {

            ((MyApplication) this.getApplication()).runs[cp1]=((MyApplication) this.getApplication()).runs[cp1]+2;
            ((MyApplication) this.getApplication()).balls[cp1]++;
            runs = runs + 2;
            TextView r = (TextView) findViewById(R.id.Runs);
            r.setText(String.valueOf(runs));
            if (overs - Math.floor(overs) == 0.5) {
                overs = ((overs * 10) + 5) / 10;
            } else {
                overs = ((overs * 10) + 1) / 10;
            }

            r = (TextView) findViewById(R.id.Overs);
            r.setText(String.valueOf(overs));
        }
    }
    public void b3(View view) {

        if(wickets<((MyApplication) this.getApplication()).n-1) {
            ((MyApplication) this.getApplication()).runs[cp1]=((MyApplication) this.getApplication()).runs[cp1]+3;
            ((MyApplication) this.getApplication()).balls[cp1]++;

            runs = runs + 3;
        cp1=cpr1+cp1;
        cpr1=cp1-cpr1;
        cp1=cp1-cpr1;
        TextView r = (TextView) findViewById(R.id.Runs);
        r.setText(String.valueOf(runs));
        if(overs - Math.floor(overs)==0.5) {
            overs = ((overs*10) + 5)/10;
        }
        else {overs=((overs*10)+1)/10;}

        r = (TextView) findViewById(R.id.Overs);
        r.setText(String.valueOf(overs));
    }}

    public void b4(View view) {
        if(wickets<((MyApplication) this.getApplication()).n-1) {
            ((MyApplication) this.getApplication()).runs[cp1]=((MyApplication) this.getApplication()).runs[cp1]+4;
            ((MyApplication) this.getApplication()).balls[cp1]++;
            runs = runs + 4;
        TextView r = (TextView) findViewById(R.id.Runs);
        r.setText(String.valueOf(runs));
        if(overs - Math.floor(overs)==0.5) {
            overs = ((overs*10) + 5)/10;
        }
        else {overs=((overs*10)+1)/10;}

        r = (TextView) findViewById(R.id.Overs);
        r.setText(String.valueOf(overs));
    }}
    public void b6(View view) {

        if(wickets<((MyApplication) this.getApplication()).n-1) {
            ((MyApplication) this.getApplication()).runs[cp1]=((MyApplication) this.getApplication()).runs[cp1]+6;
            ((MyApplication) this.getApplication()).balls[cp1]++;
        runs = runs + 6;
        TextView r = (TextView) findViewById(R.id.Runs);
        r.setText(String.valueOf(runs));
        if(overs - Math.floor(overs)==0.5) {
            overs = ((overs*10) + 5)/10;
        }
        else {overs=((overs*10)+1)/10;}

        r = (TextView) findViewById(R.id.Overs);
        r.setText(String.valueOf(overs));
    }}
    public void bw(View view) {

        if(wickets<((MyApplication) this.getApplication()).n-1) {
            ((MyApplication) this.getApplication()).balls[cp1]++;
        cp1=nxt+cp1;
        nxt=cp1-nxt;
        cp1=cp1-nxt;
        nxt++;


        wickets = wickets + 1;
        TextView r = (TextView) findViewById(R.id.Wickets);
        r.setText(String.valueOf(wickets));
        if(overs - Math.floor(overs)==0.5) {
            overs = ((overs*10) + 5)/10;
        }
        else {overs=((overs*10)+1)/10;}

        r = (TextView) findViewById(R.id.Overs);
        r.setText(String.valueOf(overs));

        if(wickets==((MyApplication) this.getApplication()).n-1)
        {
            r = (TextView) findViewById(R.id.MESSAGE);
            r.setText(String.valueOf("GAME OVER"));
        }
    }}
    public void be(View view) {
        if(wickets<=((MyApplication) this.getApplication()).n-1) {
        runs = runs + 1;
        TextView r = (TextView) findViewById(R.id.Runs);
        r.setText(String.valueOf(runs));
    }}

    public void bq(View view) {
     finish();
        Intent intent = new Intent(this, Main4Activity.class);

        startActivity(intent);

    }

}
