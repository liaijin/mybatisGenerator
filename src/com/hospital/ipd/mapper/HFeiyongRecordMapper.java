package com.hospital.ipd.mapper;

import com.hospital.ipd.pojo.HFeiyongRecord;
import com.hospital.ipd.pojo.HFeiyongRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HFeiyongRecordMapper {
    int countByExample(HFeiyongRecordExample example);

    int deleteByExample(HFeiyongRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HFeiyongRecord record);

    int insertSelective(HFeiyongRecord record);

    List<HFeiyongRecord> selectByExample(HFeiyongRecordExample example);

    HFeiyongRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HFeiyongRecord record, @Param("example") HFeiyongRecordExample example);

    int updateByExample(@Param("record") HFeiyongRecord record, @Param("example") HFeiyongRecordExample example);

    int updateByPrimaryKeySelective(HFeiyongRecord record);

    int updateByPrimaryKey(HFeiyongRecord record);
}