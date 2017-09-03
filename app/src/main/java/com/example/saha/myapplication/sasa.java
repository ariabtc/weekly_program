package com.example.saha.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by saha on 28/08/2017.
 */

public class sasa extends RecyclerView.Adapter<sasa.es>
{
    public Activity activity;
//.... other attributes


    public static List<ed> entries;

    private final Context context;






    public sasa(List<ed> entries, Context context) {


        this.entries=entries;
        this.context = context;
    }


    @Override
    public es onCreateViewHolder(ViewGroup parent, int viewType) {
        View ntq= LayoutInflater.from(parent.getContext()).inflate(R.layout.simplelist,parent,false);
        es viewholder=new es(ntq);
        return  viewholder;
    }



    @Override
    public void onBindViewHolder(es holder, int position) {



        holder.a.setText(entries.get(position).getTitle());
        holder.b.setText(entries.get(position).getBitle());
        holder.c.setText(entries.get(position).getDitle());
        holder.d.setText(entries.get(position).getFitle());
        holder.z.setText(entries.get(position).getRitle());
        //holder.c.setText(entries.get(position).getFitle());





    }

    @Override
    public int getItemCount() {
        return entries.size();
    }


    public  class es extends RecyclerView.ViewHolder{
        public TextView a,b,c,d,z;

        public es(View itemView) {

            super(itemView);
            a= (TextView) itemView.findViewById(R.id.textView8);
            b= (TextView) itemView.findViewById(R.id.textView9);
            c= (TextView) itemView.findViewById(R.id.textView10);
          d=(TextView) itemView.findViewById(R.id.textView11);
z=(TextView) itemView.findViewById(R.id.textView12);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    ;

                }
            });
        }


    }
}



