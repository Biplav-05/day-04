package com.example.day4.controller;

import com.example.day4.pojo.StudentPojo;
import com.example.day4.service.StudentInterfaceImplementation;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class StudentController {

    @Autowired
    private static StudentInterfaceImplementation studentInterfaceImplementation;
    @GetMapping(path = "/test")
    public ArrayList<StudentPojo> doThat()
    {
        ArrayList<StudentPojo> list = new ArrayList<StudentPojo>();
        list.add(new StudentPojo(555,"555","555"));
        return list;
    }


@GetMapping("/hello/{id}/{name}/{address}")
    public List<StudentPojo> taskOne(@RequestBody StudentInterfaceImplementation studentInterfaceImplementation, @PathVariable Integer id, @PathVariable String name,@PathVariable String address )
    {
        //List<StudentPojo> ll = new ArrayList<StudentPojo>();
                   return studentInterfaceImplementation.callMe(id,name,address);

    }

    @GetMapping("/he")
    public List<StudentPojo> showData(@RequestBody StudentInterfaceImplementation studentInterfaceImplementation,  @RequestParam(required = false) int id,@RequestParam(required = false) String name,@RequestParam(required = false) String address)
    {
        return  studentInterfaceImplementation.doRequestParam(id,name,address);

    }




}
