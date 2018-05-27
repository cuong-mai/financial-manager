package net.cuongmai.financialmanager.feature.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.cuongmai.financialmanager.R;

import java.util.List;

public class WidgetsViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private WidgetViewHolderFactory widgetViewHolderFactory;

    private List<WidgetViewModel> widgetViewModels;



    public WidgetsViewAdapter(List<WidgetViewModel> widgetViewModels, WidgetViewHolderFactory widgetViewHolderFactory) {
        this.widgetViewModels = widgetViewModels;
        this.widgetViewHolderFactory = widgetViewHolderFactory;
    }



    @Override
    public int getItemViewType(int position) {
        return widgetViewModels.get(position).getWidgetType();
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parentView, int widgetType) {
        return widgetViewHolderFactory.createWidgetViewHolder(parentView, widgetType);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return widgetViewModels.size();
    }
}
