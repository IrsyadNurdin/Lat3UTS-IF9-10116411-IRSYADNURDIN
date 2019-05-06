/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Walkthrough;

public class ScreenItem {

    String Title,Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
