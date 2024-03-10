package org.mylearningproject.config;

import org.mylearningproject.Admin;
import org.mylearningproject.Collage;
import org.mylearningproject.SuperAdmin;
import org.mylearningproject.Users;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class AppConfig {

  @Bean
//    public Users users( @Qualifier("superAdmin") Collage collage){
 public Users users( Collage collage){
        Users obj = new Users();
        obj.setName("devesh");
        obj.setMobile("9887767474");
        obj.setCollage(collage);
        return obj;
    }
//    @Bean
//    public Users user1(Collage collage){
//        Users obj = new Users();
//        obj.setCollage(collage);
//        return obj;
//    }
    @Bean
    public SuperAdmin superAdmin(){
        return new SuperAdmin();
    }
    @Bean
    //@Primary // When don't wanna use primary use qualifier
    public Admin Admin(){
        return new Admin();
    }
}
