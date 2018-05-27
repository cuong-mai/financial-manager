package net.cuongmai.financialmanager.feature.recent.viewholder.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.cuongmai.financialmanager.R;

public class RecentWidgetViewHolder extends RecyclerView.ViewHolder {

    private TextView recentTextView;

    public RecentWidgetViewHolder(View itemView) {
        super(itemView);
        recentTextView = itemView.findViewById(R.id.text_view_recent);
//        recentTextView.setText(itemView.get);
    }
}
