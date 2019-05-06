/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Gallery;

import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.GetterSetter;

import java.util.ArrayList;

public class GalleryData {
    public static String[][] data = new String[][]{

            {"Soekarno", "Presiden Pertama RI", "https://scontent-sin6-2.cdninstagram.com/vp/7d8aaf442110abbf88b272ccffe37468/5D741EBA/t51.2885-15/sh0.08/e35/c181.0.718.718/s640x640/47691658_160559841586375_2645459115603285472_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=107"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/441549ab8969314c0fcf526e83776e5e/5D6F43D2/t51.2885-15/sh0.08/e35/c135.0.810.810a/s640x640/47113000_1736209189824542_2508406206869821147_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=102"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/e53f45e83a31ac3a081ac489d0e07f83/5D737D97/t51.2885-15/sh0.08/e35/c0.130.1037.1037/s640x640/43985787_338786330228738_1224249588509279172_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=102"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/c3ca8125462fc59f774f0ab0791878c1/5D654CD9/t51.2885-15/sh0.08/e35/c0.110.875.875a/s640x640/41867282_1847785245329723_181937515489474968_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=111"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/fcdae2da0e95c9155dfcf5ecc4b18abe/5D6FC3C8/t51.2885-15/sh0.08/e35/c135.0.810.810a/s640x640/36873227_1566340773477580_1445929915911241728_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=104"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/c52f94dc3a438199a1d5f8ee3bf83509/5D749206/t51.2885-15/sh0.08/e35/c181.0.718.718/s640x640/30830959_405100099958015_5036774273335689216_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=111"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/f65f61f82fd61e1029ee097eae01e909/5D7018E6/t51.2885-15/sh0.08/e35/c140.0.800.800a/s640x640/30830759_2028164333922274_304375175397244928_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=110"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/ac52c7129af5ea1fde803d4f6a45bd2a/5D60AF73/t51.2885-15/sh0.08/e35/c181.0.718.718/s640x640/30592509_1850755018277914_6762100169858088960_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=110"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/abe90a367f48cf19726fdc64c83683e1/5D597A9C/t51.2885-15/sh0.08/e35/c0.136.1080.1080a/s640x640/30078036_217305965707214_3449318600836382720_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=102"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/45d459a3a1b015f4645b2e0d24915fa8/5D6656F1/t51.2885-15/sh0.08/e35/c135.0.810.810a/s640x640/30078384_521926438203220_1865979663080226816_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=104"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/daea7028b81c2d3fe7dd7ed193e5f93d/5D5AEFC3/t51.2885-15/sh0.08/e35/c140.0.800.800a/s640x640/28751151_160117817984112_7982119637837938688_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=100"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/c6e429b34971738555e995928d56e8c0/5D61C126/t51.2885-15/sh0.08/e35/c135.0.810.810a/s640x640/25010643_164445347500112_89702754208972800_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=108"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/dd9924fa6a7a6b635d4cf62d766b4d6f/5D6D120E/t51.2885-15/sh0.08/e35/c181.0.718.718a/s640x640/20766843_158617278047916_6634790299753250816_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=100"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/6f147da2670602054c909653e3e88b0c/5D5BA71B/t51.2885-15/sh0.08/e35/c110.0.860.860a/s640x640/20686842_225357434656364_5266216485759483904_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=108"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/53e1365e8a5d60e060ea755b1b960147/5D535B7F/t51.2885-15/sh0.08/e35/c181.0.718.718a/s640x640/20479348_466519423718877_71592341705588736_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=109"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/7d20fc6309b58d25c90e12f4c86f4b71/5D556E87/t51.2885-15/sh0.08/e35/c0.135.1080.1080a/s640x640/20583184_119064588735628_4038637578985930752_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=104"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/ffe2a313bcf7d4c40d60f1e433872d8e/5D56CA2C/t51.2885-15/sh0.08/e35/c0.135.1080.1080a/s640x640/20184628_501330383533685_5722095541601435648_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=105"},
            {"a","b","https://scontent-sin6-2.cdninstagram.com/vp/fd9d0b67e788f79cabd1f94f598b164e/5D608EE6/t51.2885-15/sh0.08/e35/c180.0.720.720a/s640x640/19623478_237785896711022_8677574086869647360_n.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=102"}
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
