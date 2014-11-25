package com.xjd.mol.dao.mapper.auto;

import com.xjd.mol.dao.domain.auto.ResourceDo;
import com.xjd.mol.dao.domain.auto.ResourceDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceDoMapper {
    int countByExample(ResourceDoExample example);

    int deleteByExample(ResourceDoExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(ResourceDo record);

    int insertSelective(ResourceDo record);

    List<ResourceDo> selectByExample(ResourceDoExample example);

    ResourceDo selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") ResourceDo record, @Param("example") ResourceDoExample example);

    int updateByExample(@Param("record") ResourceDo record, @Param("example") ResourceDoExample example);

    int updateByPrimaryKeySelective(ResourceDo record);

    int updateByPrimaryKey(ResourceDo record);
}