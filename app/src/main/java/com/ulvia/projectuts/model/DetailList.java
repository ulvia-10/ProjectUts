package com.ulvia.projectuts.model;

import java.util.ArrayList;

public class DetailList {
    public static String[][] dataDress = new String[][]{
            {"https://img.bdhigh.com/img/400/vn2yyd7vn4r9okm3/W6okfIPp31gmRqw9tONUNuLx.webp","Azmiya Blossom","Hiyaa","Stok: 2"
            }

    };
    public static String[][] dataShoes = new String[][]{
            {"https://img.bdhigh.com/img/400/vn2yyd7vn4r9okm3/W6okfIPp31gmRqw9tONUNuLx.webp","Azmiya Blossom","Hiyaa"
            }

    };
    public static String[][] dataBags = new String[][]{
            {"https://img.bdhigh.com/img/400/vn2yyd7vn4r9okm3/W6okfIPp31gmRqw9tONUNuLx.webp","Azmiya Blossom","Hiyaa"
            }

    };
    public static ArrayList<Detail> getListData1(){
        Detail detail;
        ArrayList<Detail> list = new ArrayList<>();

        for (String[] mData : dataDress){
            detail = new Detail();
            detail.setLogo(mData[0]);
            detail.setJudul(mData[1]);
            detail.setDesc(mData[2]);
            detail.setStok(mData[3]);
            list.add(detail);
        }
        return list;
    }

    public static ArrayList<Detail> getListData2(){
        Detail detail;
        ArrayList<Detail> list = new ArrayList<>();

        for (String[] mData : dataShoes){
            detail = new Detail();
            detail.setLogo(mData[0]);
            detail.setJudul(mData[1]);
            detail.setDesc(mData[2]);
            detail.setStok(mData[3]);
            list.add(detail);
        }
        return list;
    }
    public static ArrayList<Detail> getListData3(){
        Detail detail;
        ArrayList<Detail> list = new ArrayList<>();

        for (String[] mData : dataBags){
            detail = new Detail();
            detail.setLogo(mData[0]);
            detail.setJudul(mData[1]);
            detail.setDesc(mData[2]);
            detail.setStok(mData[3]);
            list.add(detail);
        }
        return list;
    }
}
