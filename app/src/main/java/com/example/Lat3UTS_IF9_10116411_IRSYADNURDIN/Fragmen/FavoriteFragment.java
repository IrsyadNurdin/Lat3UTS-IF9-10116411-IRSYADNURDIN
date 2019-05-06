/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.FavoriteActivity.FavoriteData;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.FavoriteActivity.FavoriteAdapter;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.GetterSetter;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.R;
import java.util.ArrayList;

public class FavoriteFragment extends Fragment {
    private RecyclerView rvCategory;
    private ArrayList<GetterSetter> list = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private FavoriteAdapter listPresidentAdapter;
    protected Context context;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FavoriteFragment() {
        // Required empty public constructor
    }

    public static FavoriteFragment newInstance(String param1, String param2) {
        FavoriteFragment fragment = new FavoriteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        rvCategory = (RecyclerView) rootView.findViewById(R.id.rv_category);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        linearLayoutManager = new LinearLayoutManager(context);
        listPresidentAdapter = new FavoriteAdapter(context);

        rvCategory.setLayoutManager(linearLayoutManager) ;
        rvCategory.setAdapter(listPresidentAdapter);

        list.addAll(FavoriteData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(context));
        FavoriteAdapter listPresidentAdapter = new FavoriteAdapter(context);
        listPresidentAdapter.setListGetterSetter(list);
        rvCategory.setAdapter(listPresidentAdapter);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }

        this.context = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
