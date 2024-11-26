package com.example.Bean;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
@Data
@Schema(description = "学生信息")
public class Student {
    @Schema(description = "主键ID",required = true,example = "1")
    private  int id;
    @Schema(description = "学生姓名",required =true)
    private String name;
    @Schema(description = "学生年龄",required = true)
    private int age;
    @Schema(description = "学生爱好",required = true)
    private String hobby;
    @Schema(description = "学生地址",required = true)
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
