
package com.example.meghana.persondetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<Person> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        try {
            InputStream inputStream=getApplicationContext().getAssets().open("personDetails.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            String json = new String(buffer, "UTF-8");
            list=new ArrayList<>();
            try {
                JSONObject jsonObject = new JSONObject(json);
                JSONArray jsonArray= jsonObject.getJSONArray("personDetails");
                Log.d("Test",jsonArray.length()+"");
                for (int i=0;i<jsonArray.length();i++){
                    JSONObject personDetails= jsonArray.getJSONObject(i);
                    Log.d("Test",personDetails.toString());
                    Person person=new Person();
                    person.setName(personDetails.getString("name"));
                    person.setEmail(personDetails.getString("email"));
                    person.setHome(personDetails.getString("home"));
                    person.setMobile(personDetails.getString("mobile"));
                    list.add(person);
                }
                PersonAdapter adapeter=new PersonAdapter(list,this);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(adapeter);
                adapeter.notifyDataSetChanged();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

