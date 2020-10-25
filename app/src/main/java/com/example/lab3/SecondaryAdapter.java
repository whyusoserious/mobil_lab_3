package com.example.lab3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SecondaryAdapter extends RecyclerView.Adapter<SecondaryAdapter.ViewHolder> {
    private final DetailActivity detailActivity;

    private String[] values;
    SecondaryAdapter(DetailActivity parent, String[] items) {
        detailActivity = parent;
        values = new String[items.length-1];
        for(int i=1; i<=values.length;i++)
            values[i-1] = items[i];
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_secondary, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.contentView.setText(values[position]);
    }
    @Override
    public int getItemCount() { return values.length;}

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView contentView;

        ViewHolder(View view) {
            super(view);
            contentView = view.findViewById(R.id.secondary_item);
        }
    }
}

