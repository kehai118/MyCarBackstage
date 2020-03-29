package com.kehai.mapper;

import com.kehai.pojo.MemberProfileLog;
import com.kehai.pojo.MemberProfileLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProfileLogDao {
    long countByExample(MemberProfileLogExample example);

    int deleteByExample(MemberProfileLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberProfileLog record);

    int insertSelective(MemberProfileLog record);

    List<MemberProfileLog> selectByExample(MemberProfileLogExample example);

    MemberProfileLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);

    int updateByExample(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);

    int updateByPrimaryKeySelective(MemberProfileLog record);

    int updateByPrimaryKey(MemberProfileLog record);
}