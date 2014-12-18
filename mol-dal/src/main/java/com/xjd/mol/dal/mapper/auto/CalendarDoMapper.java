package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.CalendarDo;
import com.xjd.mol.dal.domain.auto.CalendarDoExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalendarDoMapper {
    int countByExample(CalendarDoExample example);

    int deleteByExample(CalendarDoExample example);

    int deleteByPrimaryKey(Date solarDate);

    int insert(CalendarDo record);

    int insertSelective(CalendarDo record);

    List<CalendarDo> selectByExample(CalendarDoExample example);

    CalendarDo selectByPrimaryKey(Date solarDate);

    int updateByExampleSelective(@Param("record") CalendarDo record, @Param("example") CalendarDoExample example);

    int updateByExample(@Param("record") CalendarDo record, @Param("example") CalendarDoExample example);

    int updateByPrimaryKeySelective(CalendarDo record);

    int updateByPrimaryKey(CalendarDo record);
}