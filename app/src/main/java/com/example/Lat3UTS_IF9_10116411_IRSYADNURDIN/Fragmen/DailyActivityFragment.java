/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.DailyActivity.DailyActivity;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.DailyActivity.DailyActivityListAdapter;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.R;

import java.util.ArrayList;
import java.util.List;

public class DailyActivityFragment extends Fragment {

    private RecyclerView listMember;
    private LinearLayoutManager linearLayoutManager;
    private DailyActivityListAdapter dailyActivityListAdapter;

    protected Context context;

    public static DailyActivityFragment newInstance(){
        return new DailyActivityFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_daily_aktivity, container, false);

        listMember = (RecyclerView) rootView.findViewById(R.id.listMember);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        linearLayoutManager = new LinearLayoutManager(context);
        dailyActivityListAdapter = new DailyActivityListAdapter();

        listMember.setLayoutManager(linearLayoutManager);
        listMember.setAdapter(dailyActivityListAdapter);

        loadData();
    }

    private void loadData(){
        List<DailyActivity> dailyActivityList = new ArrayList<>();
        DailyActivity dailyActivity;

        int thumb[] = {R.drawable.daily1, R.drawable.daily2, R.drawable.daily3,
                R.drawable.daily4, R.drawable.daily5, R.drawable.daily6,R.drawable.daily7, R.drawable.daily8, R.drawable.daily9,
                R.drawable.daily10, R.drawable.daily11, R.drawable.daily12};

        String name[] = {"Kuliah", "Mengerjakan Tugas Kuliah", "Rapat Organisasi", "Ngoding",
                "Bersepeda", "Mengurus Bisnis", "Menjaga Toko", "Belanja Kebutuhan Toko", "Bersih-Bersih Halaman", "Beribadah", "Tidur", "Makan & Minum"};

        String team[] = {"Menuntut ilmu agar bisa menjadi orang yang bermanfaat", "Menyelesaikan kewajiban di rumah", "Amanah sebagai wakil ketua 1", "Belajar mengembangkan diri",
                "Olahraga rutin agar sehat dan bugar", "Agar mendapat pemasukan tambahan", "Aktivitas tambahan jika sedang santai", "Untuk memenuhi kebutuhan toko", "Menjaga kebersihan sebagian dari iman", "Agar selamat akhirat, tidak hanya dunia", "Memberikan tubuh waktu istirahat", "Agar tubuh punya asupan gizi yang baik"};

        for(int i=0; i < thumb.length; i++){
            dailyActivity = new DailyActivity();

            dailyActivity.setId(i+1);
            dailyActivity.setName(name[i]);
            dailyActivity.setTeam(team[i]);
            dailyActivity.setThumb(thumb[i]);

            dailyActivityList.add(dailyActivity);
        }

        dailyActivityListAdapter.addAll(dailyActivityList);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}