package com.ulvia.projectuts.model;

public class Logo {
    private String logo;
    private String name;
    private int rowID;

    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public Logo(String logo, String name, int rowID) {
        this.logo = logo;
        this.name = name;
        this.rowID = rowID;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
