package com.ulvia.projectuts.model;

import com.ulvia.projectuts.BagsActivity;

import java.util.ArrayList;

public class Detail {
    private String logo;
    private String name;
    private ArrayList<String> mDetail = new ArrayList<>();
    private int rowID;
    BagsActivity bags;
    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public Detail(String logo, ArrayList<String> mDetail, int rowID) {
        this.logo = logo;
        this.mDetail = mDetail;
        this.rowID = rowID;
    }


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ArrayList<String> getmDetail() {
        return mDetail;
    }

    public void setmDetail(ArrayList<String> mDetail) {
        this.mDetail = mDetail;
    }
}
