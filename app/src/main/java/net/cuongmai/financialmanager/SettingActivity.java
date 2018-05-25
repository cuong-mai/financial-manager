package net.cuongmai.financialmanager;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import net.cuongmai.financialmanager.dashboard.DashboardActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SettingActivity extends BaseActivity {

    @Nullable
    @BindView(R.id.button_setting)
    protected Button settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, DashboardActivity.class);
                intent.putExtra("newTextViewValue", "New Text Value Sent From Setting Activity");
                startActivity(intent);
            }
        });
    }
}
