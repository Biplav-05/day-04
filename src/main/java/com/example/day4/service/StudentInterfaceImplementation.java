package com.example.day4.service;

import com.example.day4.pojo.StudentPojo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentInterfaceImplementation implements StudentInterface{

    List<StudentPojo> l = new ArrayList<StudentPojo>();
    @Override
    public List<StudentPojo> callMe(Integer id,String name,String address) {

        //StudentPojo studentPojo = new StudentPojo(id,name,address);

         l.add(new StudentPojo(id,name,address));
         return l;




    }

    @Override
    public List<StudentPojo> doRequestParam(int id, String name, String address) {
        l.add(new StudentPojo(id,name,address));
        return l;
    }


}
