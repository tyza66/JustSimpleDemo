package com.tyza66.demo4.mapper;

import com.tyza66.demo4.entity.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatMapper {

    @Select("SELECT * FROM cat")
    List<Cat> getAllCats();
}
