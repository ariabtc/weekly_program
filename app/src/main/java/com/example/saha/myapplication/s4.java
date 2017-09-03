package com.example.saha.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.saha.myapplication.s2.fg;
import static com.example.saha.myapplication.s3.counter;
import static com.example.saha.myapplication.s3.day;
import static com.example.saha.myapplication.s3.hour1;
import static com.example.saha.myapplication.s3.hour2;
import static com.example.saha.myapplication.s3.min1;
import static com.example.saha.myapplication.s3.min2;
import static com.example.saha.myapplication.s3.title2;

public class s4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s4);

        RecyclerView a= (RecyclerView) (RecyclerView) findViewById(R.id.recyclerView);
        List<ed> entries1=new ArrayList<>();
        SharedPreferences q25= PreferenceManager.getDefaultSharedPreferences(this);


        SharedPreferences shared = getSharedPreferences("q25", MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
        counter = shared.getInt("famil3",-1);
        for(int x=0;x<=counter;x++){
            min1 [x] = shared.getString("asn2"+String.valueOf(x),"");
            hour1 [x] = shared.getString("asm2"+String.valueOf(x), "");
            min2[x] = shared.getString("asi2"+String.valueOf(x), "");
            hour2[x]=shared.getString("asr2"+String.valueOf(x), "");
            title2[x]=shared.getString("ash2"+String.valueOf(x), "");
            day[x]=shared.getString("ast2"+String.valueOf(x), "");
        }
     for(int c=0;c<=counter;c=c+2)
        {



        for(int j=0;j<counter-c-1;j=j+2){
            for(int k=j;k<=counter-c-1;k=k+2)
            {

                if(day[k].equals(fg)&&day[j].equals(fg)){
                   int l3=Integer.parseInt(hour1[j])*100+Integer.parseInt(min1[j]);
          int l2=Integer.parseInt(hour1[k])*100+Integer.parseInt(min1[k]);


            if(l3>l2)
            {
                String temp;
                temp=day[j];
                day[j]=day[k];
                day[k]=temp;
                temp=min1[j];
                min1[j]=min1[k];
                min1[k]=temp;
                temp=hour1[j];
                hour1[j]=hour1[k];
                hour1[k]=temp;
                temp=min2[j];
                min2[j]=min2[k];
                min2[k]=temp;
                temp=hour2[j];
                hour2[j]=hour2[k];
                hour2[k]=temp;
                temp=title2[j];
                title2[j]=title2[k];
                title2[k]=temp;


            }

        }}}}
        for(int i=0;i<=counter;i=i+2){
            if(fg.equals(day[i])){
            ed x=new ed(hour1[i]+":"+min1[i],title2[i],"","",hour2[i]+":"+min2[i]);
            entries1.add(x);
        }}
        TextView wc= (TextView) findViewById(R.id.textView7);
        wc.setText(fg);
        a.setAdapter(new sasa(entries1,s4.this));
        a.setLayoutManager(new LinearLayoutManager(this));
        a.setHasFixedSize(true);

    }
}
