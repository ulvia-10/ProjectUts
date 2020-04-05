package com.ulvia.projectuts.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Detail implements Parcelable {
    private String logo;
    private String judul;
    private String desc;
    private String stok;
    private String harga;

    protected Detail(Parcel in) {
        logo = in.readString();
        judul = in.readString();
        desc = in.readString();
        stok = in.readString();
        harga = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(logo);
        dest.writeString(judul);
        dest.writeString(desc);
        dest.writeString(stok);
        dest.writeString(harga);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }



    public Detail() {

    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

}
