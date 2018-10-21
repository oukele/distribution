package com.oukele.dao;

import com.oukele.model.Region;
import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(String regionId);

    int insert(Region record);

    Region selectByPrimaryKey(String regionId);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);
}