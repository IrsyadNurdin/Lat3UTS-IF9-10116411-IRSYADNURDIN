/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen.DailyActivityFragment;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen.FavoriteFragment;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen.GalleryFragment;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen.HomeFragment;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Fragmen.ProfileFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Fragment fragment = getSupportFragmentManager().findFragmentById(android.R.id.content);
//        if(fragment == null){
//            fragment = DailyActivityFragment.newInstance();
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(android.R.id.content, fragment, "")
//                    .commit();
//        } else {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .attach(fragment)
//                    .commit();
//        }

        FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
        FragmentTransaction transaction = ((FragmentManager) fragmentManager).beginTransaction();
        //memulai transaction fragment manager

        HomeFragment fragmentPertama = new HomeFragment();
        //membuat object fragmentPertama

        transaction.add(R.id.fl_container, fragmentPertama);
        //menambahkan fragment

        transaction.addToBackStack("fragmentPertama");
        //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik

        transaction.commit();
        //mengeksekusi fragment transaction

        //===

        // kita set default nya Home Fragment
        loadFragment(new HomeFragment());

        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    public void panggil(View view) {
        String nomor = "08157093214" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void email(View view) {
        String url = "irsyadnurdin12@gmail.com" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void instagram(View view) {
        String url = "https://instagram.com/irsyadnurdin/" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void maps(View view) {
        String url = "https://goo.gl/maps/Rqu25Gnm3MmDMxVk8" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    // method untuk load fragment yang sesuai
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    // method listener untuk logika pemilihan
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.home_menu:
                fragment = new HomeFragment();
                break;
            case R.id.daily_menu:
                fragment = new DailyActivityFragment();
                break;
            case R.id.gallery_menu:
                fragment = new GalleryFragment();
                break;
            case R.id.favorite_menu:
                fragment = new FavoriteFragment();
                break;
            case R.id.profile_menu:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
