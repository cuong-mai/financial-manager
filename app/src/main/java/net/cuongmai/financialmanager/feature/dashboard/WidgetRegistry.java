package net.cuongmai.financialmanager.feature.dashboard;

import android.support.annotation.LayoutRes;

import net.cuongmai.financialmanager.R;
import net.cuongmai.financialmanager.feature.balance.viewholder.SummaryWidgetViewHolder;
import net.cuongmai.financialmanager.feature.recent.viewholder.viewholder.RecentWidgetViewHolder;

public enum WidgetRegistry {
    SUMMARY (SummaryWidgetViewHolder.class, R.layout.widget_summary),
    RECENT (RecentWidgetViewHolder.class, R.layout.widget_recent);

    private Class widgetViewHolderClass;

    private @LayoutRes int layoutRes;

    WidgetRegistry(Class widgetViewHolderClass, @LayoutRes int layoutRes) {
        this.widgetViewHolderClass = widgetViewHolderClass;
        this.layoutRes = layoutRes;
    }

    public static Class getWidgetViewHolderClassByOrdinal(int ordinal) {
        return values()[ordinal].getWidgetViewHolderClass();
    }

    public static int getLayoutResByOrdinal(int ordinal) {
        return values()[ordinal].getLayoutRes();
    }

    public Class getWidgetViewHolderClass() {
        return widgetViewHolderClass;
    }

    public int getLayoutRes() {
        return layoutRes;
    }
}
