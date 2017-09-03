package com.example.saha.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class s3 extends AppCompatActivity {

    public static String day[]=new String[2000];
    public static String hour1[]=new String[2000];
    public static String min1[]=new String[2000];
    public static String hour2[]=new String[2000];
    public static String min2[]=new String[2000];
    public static String title2[]=new String[2000];
public static int counter=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3);




    }
    public void ons(View view){
for(int j=1;j<=2;j++){
    Spinner sp=(Spinner)findViewById( R.id.editText5);
    Spinner s=(Spinner)findViewById( R.id.editText10);
    Spinner ss=(Spinner)findViewById( R.id.editText50);
    Spinner s2=(Spinner)findViewById( R.id.editText);
    Spinner s6= (Spinner) findViewById(R.id.spinner);
        EditText a= (EditText) findViewById(R.id.editText2);
        String  aa,bb,cc,dd,gg;
        aa=String.valueOf(sp.getSelectedItem());
        bb=String.valueOf(s2.getSelectedItem());
        cc=String.valueOf(ss.getSelectedItem());
        dd=String.valueOf(s.getSelectedItem());
        String vv=a.getText().toString();
String vb=String.valueOf(s6.getSelectedItem());
        SharedPreferences q25= PreferenceManager.getDefaultSharedPreferences(this);


        SharedPreferences shared = getSharedPreferences("q25", MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
    counter = shared.getInt("famil3",-1);
    boolean flag=true;
for(int ii=0;ii<=counter;ii++){
    int l1,l2,l3,l4,d1,d2,d3,d4;
    d1=Integer.parseInt(bb)*100+Integer.parseInt(aa);
    d3=Integer.parseInt(dd)*100+Integer.parseInt(cc);

    if(d3==d1){
        Toast.makeText(s3.this,"زمان شروع با زمان پایان برابر است",Toast.LENGTH_SHORT).show();
        flag=false;
        break;
    }
    if(vb.equals(day[ii])){

        l1=Integer.parseInt(hour1[ii])*100+Integer.parseInt(min1[ii]);


        l3=Integer.parseInt(hour2[ii])*100+Integer.parseInt(min2[ii]);


        if((l1<=d1&&d1<l3)||(l1<d3&&l3>d3)){

            Toast.makeText(s3.this,"با برنامه های دیگر تداخل دارد",Toast.LENGTH_SHORT).show();
            flag=false;
            break;
        }

    }


}
if(flag==true){
    editor.putString("asn2"+String.valueOf(counter+1),aa);//min1
    editor.putString("asm2"+String.valueOf(counter+1),bb);//hour1
    editor.putString("asi2"+String.valueOf(counter+1),cc);//min2
    editor.putString("asr2"+String.valueOf(counter+1),dd);//hour2
    editor.putString("ash2"+String.valueOf(counter+1),vv);//title
    editor.putString("ast2"+String.valueOf(counter+1),vb);//day

    for(int x=0;x<=counter;x++){
        min1 [x] = shared.getString("asn2"+String.valueOf(x),"");
        hour1 [x] = shared.getString("asm2"+String.valueOf(x), "");
        min2[x] = shared.getString("asi2"+String.valueOf(x), "");
        hour2[x]=shared.getString("asr2"+String.valueOf(x), "");
        title2[x]=shared.getString("ash2"+String.valueOf(x), "");
        day[x]=shared.getString("ast2"+String.valueOf(x), "");
    }


    counter++;
    editor.putInt("famil3",counter);
    editor.apply();
}}}

}
