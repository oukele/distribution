package com.oukele.dao;

import com.oukele.model.Clinet;
import java.util.List;

public interface ClinetMapper {
    int deleteByPrimaryKey(String clinetId);

    int insert(Clinet record);

    Clinet selectByPrimaryKey(String clinetId);

    List<Clinet> selectAll();

    int updateByPrimaryKey(Clinet record);
}