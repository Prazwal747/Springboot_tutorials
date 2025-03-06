package com.example.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo  {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }



    public int addStudent(Student student){
        String sql = "insert into student (stid , name , age)  values (?,?,?)";
        int rows = jdbcTemplate.update(sql, student.getStid(),student.getName(),student.getAge());
        return rows;
    }


    public List<Student> listStudent(){
        String sql = "Select * from student";

        List<Student> studentList = jdbcTemplate.query(sql,( rs,rowNum) -> {
            Student st = new Student();
            st.setStid(rs.getInt(1));
            st.setName(rs.getString(2));
            st.setAge(rs.getInt(3));
            return st;
        });
        return studentList;
    }
}
