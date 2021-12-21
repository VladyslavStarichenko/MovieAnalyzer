package nure.ua.MovieAnalyzer.security.jwt;

import nure.ua.MovieAnalyzer.models.user.Role;
import nure.ua.MovieAnalyzer.models.user.Status;
import nure.ua.MovieAnalyzer.models.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                mapToGrantedAuthorities(new ArrayList<>(Collections.singletonList(user.getRole()))),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdatedAt()
        );
    }


    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles){
        return userRoles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());

    }
}
