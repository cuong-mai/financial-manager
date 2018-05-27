package net.cuongmai.financialmanager.feature.dashboard;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public interface WidgetViewHolderFactory {

    RecyclerView.ViewHolder createWidgetViewHolder(@NonNull ViewGroup parentView, int widgetType);

}
