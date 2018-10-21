package com.oukele.dao;

import com.oukele.model.Admins;
import java.util.List;

public interface AdminsMapper {
    int deleteByPrimaryKey(String adminsId);

    int insert(Admins record);

    Admins selectByPrimaryKey(String adminsId);

    List<Admins> selectAll();

    int updateByPrimaryKey(Admins record);
}