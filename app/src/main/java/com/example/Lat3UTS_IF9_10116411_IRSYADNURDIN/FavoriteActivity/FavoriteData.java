/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.FavoriteActivity;

import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.GetterSetter;

import java.util.ArrayList;

public class FavoriteData {
    public static String[][] data = new String[][]{

            {"Tulus", "Monokrom", "https://ecs7.tokopedia.net/img/product-1/2019/2/3/26800061/26800061_1080d22a-561e-4ea5-b03b-766ad751fac8_1400_1400.jpeg"},
            {"Sheila on 7", "Menentukan Arah", "https://nurudin.jauhari.net/wp-content/uploads/2018/09/Cover-Album-Sheila-On-7-Menentukan-Arah.jpg"},
            {"Payung Teduh", "Ruang Tunggu", "https://img.jakpost.net/c/2018/01/19/2018_01_19_39102_1516325111._large.jpg"},
            {"Payung Teduh", "Dunia Batas", "http://1.bp.blogspot.com/-DKGxlPrfTm8/T_0Wtm1dHEI/AAAAAAAAA7g/lAcaSMDvXBo/s1600/Payung+Teduh+2.jpg"},
            {"Bruno Mars", "doo-wops & hooligans", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/36d666b0-2285-4ad6-aaa9-dfc92d58587b/d7a2fss-d3f4a098-773d-44aa-9d96-5add6db00985.jpg/v1/fill/w_897,h_891,q_70,strp/_album__doo_wops_and_hooligans___bruno_mars_by_karlaandrea_d7a2fss-pre.jpg"},
            {"Bruno Mars", "Unorthodox Uykebox", "https://images-na.ssl-images-amazon.com/images/I/81jo9g-1cVL._SL1425_.jpg"},
            {"Jason Mraz", "We Sing, We Dance, We Steal Things", "https://images-na.ssl-images-amazon.com/images/I/611WlNYHmYL._SL1500_.jpg"},
            {"Fiersa Besari", "Konspirasi Alam Semesta", "https://images.genius.com/5e5f941090bf03a9b7c4105a98a6dcf6.1000x1000x1.jpg"},
            {"Afgan", "Dekade", "https://i1.wp.com/www.trinityproduction.com/wp-content/uploads/2018/03/Afgan-Dekade_Itunes-Cover.jpg?fit=1600%2C1600"},
            {"Rossa", "Yang Terpilih", "https://live.staticflickr.com/4012/4594781189_40c0711faf_b.jpg"},
            {"Dmasiv", "Persiapan", "http://dmasivband.com/uploads/album/20170413082838.jpg"},
            {"Dmasiv", "Hidup Lebih Indah", "https://3.bp.blogspot.com/-lFoKsu6yN-A/WeS6uMlouaI/AAAAAAAAAtY/kDffFa2hbvof_S7Ohtid4zaw11TKGE1BACLcBGAs/s1600/d%2527Masiv%2B-%2BHidup%2BLebih%2BIndah%2B-%2BAlbum%2B%25282014%2529%2B%255BiTunes%2BPlus%2BAAC%2BM4A%255D.jpg"},
            {"Kerispatih", "Menyerah di Hadapan Cinta", "https://i0.wp.com/www.stafabandd.live/wp-content/uploads/2019/02/Download-lagu-Kerispatih.jpg"},
            {"Seventeen", "Pantang Mundur", "https://imgcache.joox.com/music/joox/photo_id_en/mid_album_1000/3/c/a103b9a0d1a35b1ea183d590a835a13c.jpg"},
            {"Rizky Febian", "Kesempurnaan Cinta", "https://3.bp.blogspot.com/-4jszU-ijeKY/VgK58HWTeBI/AAAAAAABA9U/wp-fFYe1Ers/s1600/Rizky%2BFebian%2B-%2BKesempurnaan%2BCinta%2B-%2BSingle%2B%25282015%2529%2B%255BiTunes%2BPlus%2BAAC%2BM4A%255D.jpg"}

    };

    public static ArrayList<GetterSetter> getListData(){
        GetterSetter getterSetter = null;
        ArrayList<GetterSetter> list = new ArrayList<>();
        for (String[] aData : data) {
            getterSetter = new GetterSetter();
            getterSetter.setName(aData[0]);
            getterSetter.setRemarks(aData[1]);
            getterSetter.setPhoto(aData[2]);

            list.add(getterSetter);
        }

        return list;
    }
}
