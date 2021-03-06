package nure.ua.MovieAnalyzer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import nure.ua.MovieAnalyzer.models.user.User;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizationDto {

    private String username;
    private String password;


    public User toUser(){
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        return user;
    }


}
