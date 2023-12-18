package com.example.support_service.models;

import javax.persistence.*;

//import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long id_user;

//    @NotBlank(message = "Имя не может быть пустым")
//    @Max(value = 255, message = "Имя должно быть не более 255 символов")
    @Column(name = "name")
    private String name;


//    @NotNull(message = "Возраст не может быть пустым")
//    @Min(value = 0, message = "Возраст не может быть отрицательным")
    @Column(name = "age")
    private int age;

//    @NotBlank(message = "Почта не может быть пустой")
//    @Max(value = 255, message = "Почта должна быть не более 255 символов")
    @Column(name = "email")
    private String email;

//    @NotBlank(message = "Пароль не может быть пустым")
//    @Max(value = 255, message = "Пароль должен быть не более 255 символов")
    @Column(name = "password")
    private String password;


//    @NotBlank(message = "Роль не может быть пустой")
//    @Max(value = 255, message = "Роль должна быть не более 255 символов")
    @Column(name = "role")
    private String role;


    public User(){}
    public User(Long userID, String User_Name, Integer User_Age, String Email, String User_Password, String Role) {
        this.id_user = userID;
        this.name = User_Name;
        this.age = User_Age;
        this.email = Email;
        this.password = User_Password;
        this.role = Role;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long userID) {
        this.id_user = userID;
    }


    public String getUserName() {
        return name;
    }

    public void setUserName(String user_name) {
        this.name = user_name;
    }


    public Integer getUserAge() {
        return age;
    }

    public void setUserAge(Integer user_age) {
        this.age = user_age;
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

    public void setEmail(String Email) {
        this.email = Email;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String Role) {
        this.role = Role;
    }

}

