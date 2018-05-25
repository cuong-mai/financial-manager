package net.cuongmai.financialmanager.dashboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.cuongmai.financialmanager.BaseActivity;
import net.cuongmai.financialmanager.R;
import net.cuongmai.financialmanager.dashboard.adapter.WidgetsViewAdapter;
import net.cuongmai.financialmanager.demofeature.model.Item;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends BaseActivity {

    @Nullable
    @BindView (R.id.view_dashboard_widgets)
    protected RecyclerView widgetsView;

    private List<Item> items = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        setupWidgetsView();
    }



    private void setupWidgetsView() {
        widgetsView.setHasFixedSize(true);
        widgetsView.setLayoutManager(new LinearLayoutManager(this));
        setData();
        widgetsView.setAdapter(new WidgetsViewAdapter(items));
    }



    private void setData() {
        for (int i = 0; i < 20; i++) {
            Item item = new Item("Item " + i + ", ", "Child " + i, i % 2);
            items.add(item);
        }
    }



    @Override
    public void setupFab() {
        super.setupFab();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
    }



    @Override
    public boolean isToolbarVisible() {
        return true;
    }


    @Override
    public boolean isFabVisible() {
        return true;
    }



}
