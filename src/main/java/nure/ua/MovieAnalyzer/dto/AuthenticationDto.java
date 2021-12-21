package nure.ua.MovieAnalyzer.dto;

import lombok.Data;
import nure.ua.MovieAnalyzer.models.user.User;

@Data
public class AuthenticationDto {

    private String username;
    private String password;


    public User toUser(){
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        return user;
    }
}
