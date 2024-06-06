package br.com.lucster.user_register.dto;

import org.springframework.beans.BeanUtils;

import br.com.lucster.user_register.entity.UserEntity;

public class UserDto {
    
    private long id;
    private String name;
    private String login;
    private String password;
    private String email;
    
    public UserDto(UserEntity user) {
       BeanUtils.copyProperties(user, this);
    }

    public UserDto() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
