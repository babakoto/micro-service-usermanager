package com.makijob.usermanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue @Id
    private Long id;

    @Length(min = 4, max = 20)
    @Column(nullable = false)
    private String nom;

    @Length(min = 4, max = 20)
    @Column(nullable = false)
    private String prenom;

    @Email(message = "Please provide a valid email address")
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    public User(String nom,String email,String password) {
        this.nom = nom;
        this.email = email;
        this.password = password;
    }
}
