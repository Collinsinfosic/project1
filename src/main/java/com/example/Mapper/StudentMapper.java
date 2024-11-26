package com.example.Mapper;
import com.example.Bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
public interface StudentMapper {
    Student selectall(@Param("id") int id);

    List<Student> swagger();


}
