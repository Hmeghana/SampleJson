package com.example.meghana.persondetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {
    List<Person> list;
    Context context;
    public PersonAdapter(List<Person> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(context).inflate(R.layout.person_list,parent,false);
        return new MyViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.name.setText(list.get(position).getName());
     holder.email.setText(list.get(position).getEmail());
     holder.home.setText(list.get(position).getHome());
     holder.mobile.setText(list.get(position).getMobile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,email,home,mobile;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);
            home=itemView.findViewById(R.id.home);
            mobile=itemView.findViewById(R.id.mobile);
        }
    }
}
