package com.internevaluation.formfiller.entity;

import lombok.*;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.*;

@Entity
@Table(name = "user_file")
@Getter
@Setter
@NoArgsConstructor
public class FileList {
    public FileList(String username, String filename, Boolean permission) {
        this.username = username;
        this.filename = filename;
        this.permission = permission;
    }

    public FileList(String username, String filename) {
        this.username = username;
        this.filename = filename;
    }

    public FileList(Integer count, String username, String filename) {
        this.count = count;
        this.username = username;
        this.filename = filename;
    }

    public FileList(Integer count, String username, String filename, String email) {
        this.count = count;
        this.username = username;
        this.filename = filename;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer count=1;
    private String username;
    private String filename;
    private Boolean permission = false;
    private String email;
}
