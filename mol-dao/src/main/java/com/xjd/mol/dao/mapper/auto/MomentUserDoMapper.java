package com.xjd.mol.dao.mapper.auto;

import com.xjd.mol.dao.domain.auto.MomentUserDo;
import com.xjd.mol.dao.domain.auto.MomentUserDoExample;
import com.xjd.mol.dao.domain.auto.MomentUserDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentUserDoMapper {
    int countByExample(MomentUserDoExample example);

    int deleteByExample(MomentUserDoExample example);

    int deleteByPrimaryKey(MomentUserDoKey key);

    int insert(MomentUserDo record);

    int insertSelective(MomentUserDo record);

    List<MomentUserDo> selectByExample(MomentUserDoExample example);

    MomentUserDo selectByPrimaryKey(MomentUserDoKey key);

    int updateByExampleSelective(@Param("record") MomentUserDo record, @Param("example") MomentUserDoExample example);

    int updateByExample(@Param("record") MomentUserDo record, @Param("example") MomentUserDoExample example);

    int updateByPrimaryKeySelective(MomentUserDo record);

    int updateByPrimaryKey(MomentUserDo record);
}