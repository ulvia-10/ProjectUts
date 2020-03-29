package com.ulvia.projectuts.model;

import java.util.ArrayList;

public class detail {
    private String logo;
    private ArrayList<String> mDetail = new ArrayList<>();
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

    public detail(String logo, ArrayList<String> mDetail) {
        this.logo = logo;
        this.mDetail = mDetail;
    }





}
