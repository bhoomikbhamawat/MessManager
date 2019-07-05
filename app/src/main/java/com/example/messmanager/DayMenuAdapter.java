package com.example.messmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DayMenuAdapter extends RecyclerView.Adapter<DayMenuAdapter.ViewHolder> {

    private List<DayMenuCard> mUploads;

    public DayMenuAdapter(List<DayMenuCard> mUploads) {
        this.mUploads = mUploads;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_daywise, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DayMenuCard uploadCurrent = mUploads.get(position);
        holder.day.setText(uploadCurrent.getDay());
        holder.breakfast.setText(uploadCurrent.getBreakfast());
        holder.lunch.setText(uploadCurrent.getLunch());
        holder.dinner.setText(uploadCurrent.getDinner());
    }


    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView day,breakfast,lunch,dinner;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            day=itemView.findViewById(R.id.menu_day);
            breakfast=itemView.findViewById(R.id.menu_breakfast);
            lunch=itemView.findViewById(R.id.menu_lunch);
            dinner=itemView.findViewById(R.id.menu_dinner);
        }
    }
}
