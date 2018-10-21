package com.oukele.dao;

import com.oukele.model.Cars;
import java.util.List;

public interface CarsMapper {
    int deleteByPrimaryKey(String carsId);

    int insert(Cars record);

    Cars selectByPrimaryKey(String carsId);

    List<Cars> selectAll();

    int updateByPrimaryKey(Cars record);
}