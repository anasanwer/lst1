package com.example.anas.jawabebhook;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.app.SearchManager;
import android.support.v7.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;

public class customlistview1 extends AppCompatActivity {

   ListView listView;
  listviewadapter adapter;
    String[] description;
    String[] title;
    int[] icon;




    ArrayList<Model> arrayList=new ArrayList<Model>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlistview1);

       ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("item List");

        listView=(ListView)findViewById(R.id.listview);
        title=new String[]{"Boston","Iceberg","Mache","Romaine","Roquette"};
        description=new String[]{"detail...","full...","half...","low...","show..."};
        icon=new int[]{R.drawable.boston,R.drawable.ceberg,R.drawable.mache,R.drawable.omaine,R.drawable.roquette};

        for(int i=0;i<title.length;i++){

            Model model = new Model(title[i],description[i],icon[i]);
            arrayList.add(model);

        }


         adapter=new listviewadapter(this,arrayList);
         listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem myActionMenu = menu.findItem(R.id.action_search);
       SearchView searchview=(SearchView)myActionMenu.getActionView();
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();


                }
                else{
                    adapter.filter(s);



                }

                return true;


            }
        });

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_settings){

            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
