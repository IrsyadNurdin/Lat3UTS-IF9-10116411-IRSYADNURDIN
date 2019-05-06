/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.DailyActivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.R;

import java.util.ArrayList;
import java.util.List;

public class DailyActivityListAdapter extends RecyclerView.Adapter<DailyActivityListAdapter.MemberViewHolder>{

    private List<DailyActivity> dailyActivityList;

    public DailyActivityListAdapter() {
        dailyActivityList = new ArrayList<>();
    }

    private void add(DailyActivity item) {
        dailyActivityList.add(item);
        notifyItemInserted(dailyActivityList.size() - 1);
    }

    public void addAll(List<DailyActivity> dailyActivityList) {
        for (DailyActivity dailyActivity : dailyActivityList) {
            add(dailyActivity);
        }
    }

    public void remove(DailyActivity item) {
        int position = dailyActivityList.indexOf(item);
        if (position > -1) {
            dailyActivityList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public DailyActivity getItem(int position){
        return dailyActivityList.get(position);
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_favorite, parent, false);
        MemberViewHolder memberViewHolder = new MemberViewHolder(view);
        return memberViewHolder;
    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        final DailyActivity dailyActivity = dailyActivityList.get(position);

        holder.memberThumb.setImageResource(dailyActivity.getThumb());
        holder.memberName.setText(dailyActivity.getName());
        holder.memberTeam.setText(dailyActivity.getTeam());
    }

    @Override
    public int getItemCount() {
        return dailyActivityList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    static class MemberViewHolder extends RecyclerView.ViewHolder {

        ImageView memberThumb;
        TextView memberName;
        TextView memberTeam;

        public MemberViewHolder(View itemView) {
            super(itemView);

            memberThumb = (ImageView) itemView.findViewById(R.id.thumb);
            memberName = (TextView) itemView.findViewById(R.id.name);
            memberTeam = (TextView) itemView.findViewById(R.id.team);
        }
    }
}
