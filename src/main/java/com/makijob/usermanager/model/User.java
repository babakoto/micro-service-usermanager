package com.makijob.usermanager.model;

import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue @Id
    private Long id;
    @NotNull @Length(min = 4, max = 10)
    private String nom;
    @NotNull @Email(message = "Please provide a valid email address")
    private String email;
    @NotNull
    private String password;

}
