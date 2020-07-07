package com.example.rohitranjan.foodonbook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class fetchAdapter extends ArrayAdapter {

    private Activity context;
    private int resource;
    private List<pojoFetch> listImage;
    private List<pojoFetch> modal;
    List<String> Item;
    fetchAdapter adapter;
    ListView lv;
    //private fetchAdapter adapter;

    public fetchAdapter(@NonNull Activity context, int resource, @NonNull List<pojoFetch> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listImage = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final LayoutInflater inflater = context.getLayoutInflater();

        @SuppressLint("ViewHolder") View v = inflater.inflate(resource, null);
        TextView tvName = (TextView) v.findViewById(R.id.Username);
        TextView tvNumber = (TextView) v.findViewById(R.id.number);
        TextView tvTotal = (TextView) v.findViewById(R.id.amountValue);
        TextView tableNumber = (TextView) v.findViewById(R.id.tableNumber);
        TextView rating = (TextView) v.findViewById(R.id.ratingbar);
        tvName.setText(listImage.get(position).getUsername());
        tvNumber.setText(listImage.get(position).getNumber());
        tvTotal.setText(listImage.get(position).getTotalAmount());
        tableNumber.setText(listImage.get(position).getDataTable());
        rating.setText(listImage.get(position).getRating());
        return v;
    }


}
