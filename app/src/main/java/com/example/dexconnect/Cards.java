package com.example.dexconnect;

public class Cards {
    private String title;
    private String aud;
    private String dLine;
    private String link;
    private String refLink1;
    private String refTitle1;
    private String refLink2;
    private String refTitle2;
    private String desc;

    public Cards(String title, String aud, String dLine, String link, String refLink1, String refTitle1, String refLink2, String refTitle2, String desc) {
        this.title = title;
        this.aud = aud;
        this.dLine = dLine;
        this.link = link;
        this.refLink1 = refLink1;
        this.refTitle1 = refTitle1;
        this.refLink2 = refLink2;
        this.refTitle2 = refTitle2;
        this.desc = desc;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getdLine() {
        return dLine;
    }

    public void setdLine(String dLine) {
        this.dLine = dLine;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getRefLink1() {
        return refLink1;
    }

    public void setRefLink1(String refLink1) {
        this.refLink1 = refLink1;
    }

    public String getRefTitle1() {
        return refTitle1;
    }

    public void setRefTitle1(String refTitle1) {
        this.refTitle1 = refTitle1;
    }

    public String getRefLink2() {
        return refLink2;
    }

    public void setRefLink2(String refLink2) {
        this.refLink2 = refLink2;
    }

    public String getRefTitle2() {
        return refTitle2;
    }

    public void setRefTitle2(String refTitle2) {
        this.refTitle2 = refTitle2;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public Cards(){

    }



}
