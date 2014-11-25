package com.xjd.mol.dao.mapper.auto;

import com.xjd.mol.dao.domain.auto.MomentDo;
import com.xjd.mol.dao.domain.auto.MomentDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentDoMapper {
    int countByExample(MomentDoExample example);

    int deleteByExample(MomentDoExample example);

    int deleteByPrimaryKey(Long mntId);

    int insert(MomentDo record);

    int insertSelective(MomentDo record);

    List<MomentDo> selectByExample(MomentDoExample example);

    MomentDo selectByPrimaryKey(Long mntId);

    int updateByExampleSelective(@Param("record") MomentDo record, @Param("example") MomentDoExample example);

    int updateByExample(@Param("record") MomentDo record, @Param("example") MomentDoExample example);

    int updateByPrimaryKeySelective(MomentDo record);

    int updateByPrimaryKey(MomentDo record);
}