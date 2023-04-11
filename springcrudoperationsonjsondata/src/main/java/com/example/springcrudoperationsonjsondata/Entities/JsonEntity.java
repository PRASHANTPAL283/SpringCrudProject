package com.example.springcrudoperationsonjsondata.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JsonEntity {

    public String userId;
    public String id;
    public String title;
    public String body;

}
