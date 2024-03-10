package org.mylearningproject;

import org.springframework.beans.factory.annotation.Qualifier;

import java.beans.ConstructorProperties;

public class Users{
    private int count ;
    @Qualifier("admin")
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

 //   @ConstructorProperties({"name","mobile"})
    public Users(String name, String mobile ,Collage collage) {
        System.out.println("kfkkfkfk1122");
        this.name = name;
        this.mobile = mobile;
       this.collage = collage;
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
        //System.out.println(name);
        return collage.getBranch();
    }
}
