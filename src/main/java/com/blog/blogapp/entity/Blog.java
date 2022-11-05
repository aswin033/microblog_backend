package com.blog.blogapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogid;
    private String blogUser;
    private String blogUserid;
    private String blogtitle;
    @Lob
    private String blogcontent;
    private String blogfile;
    private String blogtime;
}
