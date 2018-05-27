package net.cuongmai.financialmanager.feature.recent.viewholder.model;

import net.cuongmai.financialmanager.feature.dashboard.WidgetRegistry;
import net.cuongmai.financialmanager.feature.dashboard.WidgetViewModel;

public class RecentWidgetViewModel extends WidgetViewModel {

    private String summary;

    public RecentWidgetViewModel(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public int getWidgetType() {
        return WidgetRegistry.RECENT.ordinal();
    }
}