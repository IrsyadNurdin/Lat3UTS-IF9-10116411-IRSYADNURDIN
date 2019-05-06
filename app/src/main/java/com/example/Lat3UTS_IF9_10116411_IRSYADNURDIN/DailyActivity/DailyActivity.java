/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.DailyActivity;

import android.os.Parcel;
import android.os.Parcelable;

public class DailyActivity implements Parcelable {

    private int id;
    private String name;
    private String team;
    private int thumb;

    public DailyActivity() {

    }

    protected DailyActivity(Parcel in) {
        id = in.readInt();
        name = in.readString();
        team = in.readString();
        thumb = in.readInt();
    }

    public static final Creator<DailyActivity> CREATOR = new Creator<DailyActivity>() {
        @Override
        public DailyActivity createFromParcel(Parcel in) {
            return new DailyActivity(in);
        }

        @Override
        public DailyActivity[] newArray(int size) {
            return new DailyActivity[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(team);
        dest.writeInt(thumb);
    }
}
