package com.oukele.dao;

import com.oukele.model.UserGroup;
import java.util.List;

public interface UserGroupMapper {
    int deleteByPrimaryKey(String userGroupId);

    int insert(UserGroup record);

    UserGroup selectByPrimaryKey(String userGroupId);

    List<UserGroup> selectAll();

    int updateByPrimaryKey(UserGroup record);
}