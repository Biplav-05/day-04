package com.example.day4.pojo;

public class StudentPojo {
    Integer id;
    String name;
    String address;

    //Constructor

    public StudentPojo(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    //getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //object to string

    @Override
    public String toString() {
        return "StudentPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
