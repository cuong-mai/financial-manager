package net.cuongmai.financialmanager.feature.demofeature.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.cuongmai.financialmanager.R;

public class ItemWithoutChildViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public ItemWithoutChildViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_view_1);
    }
}
