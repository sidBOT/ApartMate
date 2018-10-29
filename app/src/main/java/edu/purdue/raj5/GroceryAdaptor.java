package com.example.dell.apartmate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class GroceryAdaptor extends RecyclerView.Adapter<GroceryAdaptor.ViewHolder> {
    private Context mContext;
    private ArrayList<String> mGroupNames = new ArrayList<>();

    public GroceryAdaptor(Context mContext, ArrayList<String> mGroupNames) {
        this.mContext = mContext;
        this.mGroupNames = mGroupNames;
    }

    @NonNull
    @Override
    public GroceryAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grocery,viewGroup,false);
        GroceryAdaptor.ViewHolder holder = new GroceryAdaptor.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView groceryName;
        TextView groceryNumItems;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            groceryName = (TextView) itemView.findViewById(R.id.tv_groceryName);
            groceryNumItems = (TextView) itemView.findViewById(R.id.tv_groceryNumItems);

        }
    }
}
