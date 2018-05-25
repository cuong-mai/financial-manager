package net.cuongmai.financialmanager.dashboard.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.cuongmai.financialmanager.R;
import net.cuongmai.financialmanager.demofeature.model.Item;
import net.cuongmai.financialmanager.demofeature.viewholder.ItemWithChildViewHolder;
import net.cuongmai.financialmanager.demofeature.viewholder.ItemWithoutChildViewHolder;

import java.util.List;

public class WidgetsViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE_FEATURE_ONE_A = 0;

    private final int TYPE_FEATURE_TWO_A = 1;

    private List<Item> items;

    private Context context;



    public WidgetsViewAdapter(List<Item> items) {
        this.items = items;
    }



    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;

        switch (viewType) {
            case TYPE_FEATURE_ONE_A:
                view = layoutInflater.inflate(R.layout.feature_one_view_widget_a, parent, false);
                return new ItemWithChildViewHolder(view);
            case TYPE_FEATURE_TWO_A:
                view = layoutInflater.inflate(R.layout.feature_two_view_widget_a, parent, false);
                return new ItemWithoutChildViewHolder(view);
            default:
                return null;
        }
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TYPE_FEATURE_ONE_A:

                break;
            case TYPE_FEATURE_TWO_A:

                break;
        }
    }



    @Override
    public int getItemCount() {
        return items.size();
    }
}
