package com.kehai.mapper;

import com.kehai.pojo.MemberProfile;
import com.kehai.pojo.MemberProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProfileDao {
    long countByExample(MemberProfileExample example);

    int deleteByExample(MemberProfileExample example);

    int deleteByPrimaryKey(Long memberId);

    int insert(MemberProfile record);

    int insertSelective(MemberProfile record);

    List<MemberProfile> selectByExample(MemberProfileExample example);

    MemberProfile selectByPrimaryKey(Long memberId);

    int updateByExampleSelective(@Param("record") MemberProfile record, @Param("example") MemberProfileExample example);

    int updateByExample(@Param("record") MemberProfile record, @Param("example") MemberProfileExample example);

    int updateByPrimaryKeySelective(MemberProfile record);

    int updateByPrimaryKey(MemberProfile record);
}