package com.oukele.dao;

import com.oukele.model.Station;
import java.util.List;

public interface StationMapper {
    int deleteByPrimaryKey(Integer stationId);

    int insert(Station record);

    Station selectByPrimaryKey(Integer stationId);

    List<Station> selectAll();

    int updateByPrimaryKey(Station record);
}