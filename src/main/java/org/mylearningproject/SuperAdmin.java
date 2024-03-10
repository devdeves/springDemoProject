package org.mylearningproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class SuperAdmin implements Collage {
    public String createBranch(){
        return  "CREATE BRANCH FROM BRANCH SCOPE DIRECTLY";
    }
    public String getBranch(){
        return  "GET BRANCH FROM BRANCH SUPER-ADMIN";
    }
}
