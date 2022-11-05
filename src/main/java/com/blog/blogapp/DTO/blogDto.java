package com.blog.blogapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class blogDto {


    private String blogUserid;
    private String blogtitle;
    private String blogcontent;
    private String blogfile;
}
