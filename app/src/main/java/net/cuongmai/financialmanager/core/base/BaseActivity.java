package net.cuongmai.financialmanager.core.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import net.cuongmai.financialmanager.R;
import net.cuongmai.financialmanager.feature.dashboard.DashboardActivity;
import net.cuongmai.financialmanager.feature.setting.SettingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    protected Unbinder binder;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @BindView(R.id.layout_base_container)
    protected DrawerLayout baseContainer;

    @BindView(R.id.layout_base_frame)
    protected FrameLayout baseFrame;

    @BindView(R.id.navigation_view_side)
    protected NavigationView sideNavigationView;

    @BindView(R.id.fab)
    protected FloatingActionButton fab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.activity_base);
        binder = ButterKnife.bind(this);

        inflateActivityView(layoutResID);

        setupToolbar();
        setupDrawerToggle();
        setupNavigationView();
        setupFab();
    }



    protected void setupToolbar() {
        setSupportActionBar(toolbar);
    }



    private void setupDrawerToggle() {
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, baseContainer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerToggle.syncState();
        baseContainer.addDrawerListener(drawerToggle);
    }



    private void setupNavigationView() {
        sideNavigationView.setNavigationItemSelectedListener(this);
    }



    private void inflateActivityView(int layoutResID) {
        getLayoutInflater().inflate(layoutResID, baseFrame, true);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        launchTargetActivity(item);
        baseContainer.closeDrawer(GravityCompat.START);
        return true;
    }



    private void launchTargetActivity(MenuItem item) {
        Class targetClass = getTargetActivityClass(item);
        Intent intent = new Intent(getApplicationContext(), targetClass);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }



    private Class getTargetActivityClass(MenuItem item) {
        Class targetClass = null;
        switch (item.getItemId()) {
            case R.id.navigation_menu_dashboard:
                targetClass = DashboardActivity.class;
                break;
            case R.id.navigation_menu_setting:
                targetClass = SettingActivity.class;
                break;
            default:
        }
        return targetClass;
    }



    @Override
    public void onBackPressed() {
        if (baseContainer.isDrawerOpen(GravityCompat.START)) {
            baseContainer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        binder.unbind();
    }



    public boolean isToolbarVisible() {
        return false;
    }



    public boolean isFabVisible() {
        return false;
    }



    public void setupFab() {
        if (isFabVisible()) {
            fab.setVisibility(FloatingActionButton.VISIBLE);
        } else {
            fab.setVisibility(FloatingActionButton.INVISIBLE);
        }
    }
}
