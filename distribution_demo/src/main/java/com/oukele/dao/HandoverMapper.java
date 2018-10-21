package com.oukele.dao;

import com.oukele.model.Handover;
import java.util.List;

public interface HandoverMapper {
    int deleteByPrimaryKey(String handoverStartCity);

    int insert(Handover record);

    Handover selectByPrimaryKey(String handoverStartCity);

    List<Handover> selectAll();

    int updateByPrimaryKey(Handover record);
}