package com.xjd.mol.dao.mapper.auto;

import com.xjd.mol.dao.domain.auto.HisTodayDo;
import com.xjd.mol.dao.domain.auto.HisTodayDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayDoMapper {
    int countByExample(HisTodayDoExample example);

    int deleteByExample(HisTodayDoExample example);

    int deleteByPrimaryKey(Long evtId);

    int insert(HisTodayDo record);

    int insertSelective(HisTodayDo record);

    List<HisTodayDo> selectByExample(HisTodayDoExample example);

    HisTodayDo selectByPrimaryKey(Long evtId);

    int updateByExampleSelective(@Param("record") HisTodayDo record, @Param("example") HisTodayDoExample example);

    int updateByExample(@Param("record") HisTodayDo record, @Param("example") HisTodayDoExample example);

    int updateByPrimaryKeySelective(HisTodayDo record);

    int updateByPrimaryKey(HisTodayDo record);
}