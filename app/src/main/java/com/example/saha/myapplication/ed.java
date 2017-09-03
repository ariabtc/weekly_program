package com.example.saha.myapplication;

/**
 * Created by saha on 28/08/2017.
 */

public class ed {


    private    String title,bitle,fitle,ditle,ritle;

    public ed(String title, String bitle,String fitle,String ditle,String ritle) {
        this.title = title;
        this.bitle = bitle;
        this.fitle=fitle;
        this.ditle=ditle;
        this.ritle=ritle;
    }




    public String getTitle() {
        return title;
    }

    public String getBitle() {
        return bitle;
    }

    public void setBitle(String bitle) {
        this.bitle = bitle;
    }
    public void setTitle(String a){

        title=a;
    }

    public String getFitle() {
        return fitle;
    }

    public void setFitle(String fitle) {
        this.fitle = fitle;}

    public String getDitle() {
        return ditle;
    }

    public void setDitle(String ditle) {
        this.ditle = ditle;
    }

    public String getRitle() {
        return ritle;
    }

    public void setRitle(String ritle) {
        this.ritle = ritle;
    }
}
