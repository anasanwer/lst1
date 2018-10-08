package com.example.anas.customlistviewwithsearchbar;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class listviewadapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    public listviewadapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater= LayoutInflater.from(mContext);
        this.arrayList= new ArrayList<Model>();
        this.arrayList.addAll(modellist);



    }
    public  class ViewHolder{
        TextView mTitletv,mDescTv;
        ImageView mIconIv;

    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        ViewHolder holder;
        if(view==null)
        {

            holder=new ViewHolder();
            view = inflater.inflate(R.layout.customrow,null);
            holder.mTitletv = view.findViewById(R.id.Title1);
            holder.mDescTv=view.findViewById(R.id.desc1);
            holder.mIconIv=view.findViewById(R.id.customimage1);
            view.setTag(holder);


        }
        else{

            holder = (ViewHolder)view.getTag();


        }

        holder.mTitletv.setText(modellist.get(position).getTitle());
        holder.mDescTv.setText(modellist.get(position).getTitle());
        holder.mIconIv.setImageResource(modellist.get(position).getIcon());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modellist.get(position).getTitle().equals("Boston")){

                    Intent intent = new Intent(mContext,salatkapage1.class);
                    intent.putExtra("ActionbarTitle","Boston");
                    intent.putExtra("contentTv","this is Boston detail");
                    mContext.startActivity(intent);


                }
                if(modellist.get(position).getTitle().equals("Iceberg")){

                    Intent intent = new Intent(mContext,salatkapage1.class);
                    intent.putExtra("ActionbarTitle","Iceberg");
                    intent.putExtra("contentTv","this is Iceberg detail");
                    mContext.startActivity(intent);


                }
                if(modellist.get(position).getTitle().equals("Mache")){

                    Intent intent = new Intent(mContext,salatkapage1.class);
                    intent.putExtra("ActionbarTitle","Mache");
                    intent.putExtra("contentTv","this is Mache detail");
                    mContext.startActivity(intent);


                }
                if(modellist.get(position).getTitle().equals("Romaine")){

                    Intent intent = new Intent(mContext,salatkapage1.class);
                    intent.putExtra("ActionbarTitle","Romaine");
                    intent.putExtra("contentTv","this is Romaine detail");
                    mContext.startActivity(intent);


                }
                if(modellist.get(position).getTitle().equals("Roquette")){

                    Intent intent = new Intent(mContext,salatkapage1.class);
                    intent.putExtra("ActionbarTitle","Roquette");
                    intent.putExtra("contentTv","this is Roquette detail");
                    mContext.startActivity(intent);


                }

            }
        });

        return view;
    }
    public  void filter(String charText){

        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if(charText.length()==0){
            modellist.addAll(arrayList);

        }
        else{
            for (Model model:arrayList){
                if(model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)
                        ){
                    modellist.add(model);



                }

            }


        }
        notifyDataSetChanged();

    }




}
