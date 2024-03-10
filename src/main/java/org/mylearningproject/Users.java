package org.mylearningproject;

import java.beans.ConstructorProperties;

public class Users{
    private int count ;
    private Collage collage;
    String name ;
    String mobile;

    public Collage getCollage() {
        return collage;
    }

    public void setCollage(Collage collage) {
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @ConstructorProperties({"name","mobile"})
    public Users(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Users() {
        System.out.println("kdkkdd");
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getBranch() {
        return collage.getBranch();
    }
}
