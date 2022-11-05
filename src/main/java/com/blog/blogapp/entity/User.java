package com.blog.blogapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_user")
public class User {

    @Id
    private String id;
    private String username;
    private String email;
    private int isEnabled;
}
