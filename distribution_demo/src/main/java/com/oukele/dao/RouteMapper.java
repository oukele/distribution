package com.oukele.dao;

import com.oukele.model.Route;
import java.util.List;

public interface RouteMapper {
    int deleteByPrimaryKey(String routeId);

    int insert(Route record);

    Route selectByPrimaryKey(String routeId);

    List<Route> selectAll();

    int updateByPrimaryKey(Route record);
}