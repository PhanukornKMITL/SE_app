package com.example.seapp.ui.notifications;

public class modelnotification {
    private String userid;
    private String name;
    private String postKey;
    private int pic;
    private String detail;

    public modelnotification(){

    }
    public modelnotification(String userid, String name, String postKey, int pic, String detail) {
        this.userid = userid;
        this.name = name;
        this.postKey = postKey;
        this.pic = pic;
        this.detail = detail;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {return name;}

    public void setName(String name) { this.name = name;}

    public String getPostKey() { return postKey; }

    public void setPostKey(String postKey) { this.postKey = postKey;}

    public int getPic() {return pic;}

    public void setPic(int pic) {this.pic = pic;}

    public String getDetail() {return detail; }

    public void setDetail(String detail) {this.detail = detail;}
}



