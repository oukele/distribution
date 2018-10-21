package com.oukele.dao;

import com.oukele.model.Province;
import java.util.List;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String provinceId);

    int insert(Province record);

    Province selectByPrimaryKey(String provinceId);

    List<Province> selectAll();

    int updateByPrimaryKey(Province record);
}