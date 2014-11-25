package com.xjd.mol.dao.mapper.auto;

import com.xjd.mol.dao.domain.auto.UserDo;
import com.xjd.mol.dao.domain.auto.UserDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDoMapper {
    int countByExample(UserDoExample example);

    int deleteByExample(UserDoExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    List<UserDo> selectByExample(UserDoExample example);

    UserDo selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByExample(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}