package net.cuongmai.financialmanager.feature.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WidgetViewHolderFactoryImpl implements WidgetViewHolderFactory {

    @Override
    public RecyclerView.ViewHolder createWidgetViewHolder(@NonNull ViewGroup parentView, int widgetType) {
        Context context = parentView.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View widget;

        try {
            int layoutRes = WidgetRegistry.getLayoutResByOrdinal(widgetType);
            Class<RecyclerView.ViewHolder> widgetViewHolderClass = WidgetRegistry.getWidgetViewHolderClassByOrdinal(widgetType);
            widget = layoutInflater.inflate(layoutRes, parentView, false);
            return  widgetViewHolderClass.getConstructor(View.class).newInstance(widget);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
