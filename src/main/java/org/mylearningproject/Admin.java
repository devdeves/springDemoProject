package org.mylearningproject;

import org.springframework.stereotype.Component;

//@Component("admin") //handle in case of qualifier
@Component()
public class Admin implements Collage {
    public String createBranch(){
        return  "CREATE BRANCH FROM BRANCH SCOPE DIRECTLY";
    }
    public String getBranch(){
        return  "GET BRANCH FROM BRANCH ADMIN";
    }
}

