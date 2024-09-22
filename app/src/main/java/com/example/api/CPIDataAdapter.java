package com.example.api;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CPIDataAdapter extends RecyclerView.Adapter<CPIDataAdapter.ViewHolder> {

    private List<CPIData> dataList;

    public CPIDataAdapter(List<CPIData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cpi_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CPIData data = dataList.get(position);
        holder.countryTextView.setText(data.getCountry());
        holder.typeTextView.setText(data.getType());
        holder.periodTextView.setText(data.getPeriod());
        holder.monthlyRateTextView.setText(String.valueOf(data.getMonthly_rate_pct()));
        holder.yearlyRateTextView.setText(String.valueOf(data.getYearly_rate_pct()));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView countryTextView;
        public TextView typeTextView;
        public TextView periodTextView;
        public TextView monthlyRateTextView;
        public TextView yearlyRateTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            countryTextView = itemView.findViewById(R.id.countryTextView);
            typeTextView = itemView.findViewById(R.id.typeTextView);
            periodTextView = itemView.findViewById(R.id.periodTextView);
            monthlyRateTextView = itemView.findViewById(R.id.monthlyRateTextView);
            yearlyRateTextView = itemView.findViewById(R.id.yearlyRateTextView);
        }
    }
}