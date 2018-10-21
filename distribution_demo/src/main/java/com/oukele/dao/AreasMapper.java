package com.oukele.dao;

import com.oukele.model.Areas;
import java.util.List;

public interface AreasMapper {
    int deleteByPrimaryKey(Integer areasId);

    int insert(Areas record);

    Areas selectByPrimaryKey(Integer areasId);

    List<Areas> selectAll();

    int updateByPrimaryKey(Areas record);
}