package net.cuongmai.financialmanager.feature.balance.model;

import net.cuongmai.financialmanager.feature.dashboard.WidgetRegistry;
import net.cuongmai.financialmanager.feature.dashboard.WidgetViewModel;

public class SummaryWidgetViewModel extends WidgetViewModel {

    private String summary;

    public SummaryWidgetViewModel(String summary) {
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
        return WidgetRegistry.SUMMARY.ordinal();
    }
}