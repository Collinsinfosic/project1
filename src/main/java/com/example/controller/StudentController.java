package com.example.controller;

import com.example.Mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.Bean.Student;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "控制器Student:测试swagger3",description = "描述：测试swagger3")
@RestController
public class StudentController {
    private final StudentMapper studentMapper;

    public StudentController(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    //根据ID查找对应学生信息
    @GetMapping("/selectall/{id}")
    @Operation(summary = "ID",description = "根据ID查询某个学生的信息")
    public Student selectall(@PathVariable("id") int id){
        Student student = null;
        student = studentMapper.selectall(id);
        return  student;
    }

    @GetMapping("/swagger")
    @Operation(description = "查询所有学生的信息")
    public List<Student> swagger(){
        List<Student> student =null;
        student = studentMapper.swagger();
        return  student;
    }

}
