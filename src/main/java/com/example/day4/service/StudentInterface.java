package com.example.day4.service;

import com.example.day4.pojo.StudentPojo;

import java.util.List;

public interface StudentInterface {

    public List<StudentPojo> callMe(Integer id, String name, String address);

    List<StudentPojo> doRequestParam(int id, String name, String address);
}
