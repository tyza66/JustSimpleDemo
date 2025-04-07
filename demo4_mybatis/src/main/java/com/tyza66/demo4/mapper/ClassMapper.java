package com.tyza66.demo4.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import com.tyza66.demo4.entity.Class;

@Mapper
public interface ClassMapper {
    @Select("SELECT * FROM class")
    List<Class> getAllClasses();
}
