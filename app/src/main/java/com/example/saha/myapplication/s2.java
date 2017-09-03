package com.example.saha.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.saha.myapplication.s3.counter;

public class s2 extends AppCompatActivity {
public static String fg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2);


    }

    public void s(View view) {
        fg="sathurday";
        Intent a=new Intent(getApplicationContext(),s4.class);
startActivity(a);
    }

    public void s1(View view) {
        fg="sunday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }

    public void s2(View view) {
        fg="monday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }

    public void s3(View view) {
        fg="tuesday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }

    public void s4(View view) {
        fg="wednesday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }

    public void s5(View view) {
        fg="thursday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }

    public void s6(View view) {
        fg="friday";
        Intent a=new Intent(getApplicationContext(),s4.class);
        startActivity(a);
    }
    public void q1(View view){
del("sathurday");

    }
    public void q2(View view){

        del("sunday");
    } public void q3(View view){
        del("monday");

    } public void q4(View view){
        del("tuesday");

    } public void q5(View view){

        del("wednesday");
    } public void q6(View view){
        del("thursday");

    } public void q7(View view){
    del("friday");

    }
    public void del(String a){
    SharedPreferences q25= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences shared = getSharedPreferences("q25", MODE_PRIVATE);
    SharedPreferences.Editor editor = shared.edit();
    for(int jj=0;jj<=counter;jj++)
        if(a.equals(shared.getString("ast2"+String.valueOf(jj), ""))){

            editor.putString("asn2"+String.valueOf(jj),"d");//min1
            editor.putString("asm2"+String.valueOf(jj),"d");//hour1
            editor.putString("asi2"+String.valueOf(jj),"d");//min2
            editor.putString("asr2"+String.valueOf(jj),"d");//hour2
            editor.putString("ash2"+String.valueOf(jj),"d");//title
            editor.putString("ast2"+String.valueOf(jj),"d");//day
            editor.apply();
        }

    }
}