package com.cooler.semantic.dao;

import com.cooler.semantic.dto.LogDataProcessDTO;
import com.cooler.semantic.entity.LogDataProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogDataProcessMapper extends BaseMapper<LogDataProcess> {

    List<LogDataProcessDTO> selectByAIdUIdDateTime(@Param("accountId") Integer accountId,
                                                   @Param("userId")Integer userId,
                                                   @Param("fromDateTime")String fromDateTime,
                                                   @Param("toDateTime")String toDateTime);
}