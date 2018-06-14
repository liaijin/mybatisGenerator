package com.qcloud.mapper;

import com.qcloud.pojo.JobPosition;
import com.qcloud.pojo.JobPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobPositionMapper {
    int countByExample(JobPositionExample example);

    int deleteByExample(JobPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobPosition record);

    int insertSelective(JobPosition record);

    List<JobPosition> selectByExample(JobPositionExample example);

    JobPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobPosition record, @Param("example") JobPositionExample example);

    int updateByExample(@Param("record") JobPosition record, @Param("example") JobPositionExample example);

    int updateByPrimaryKeySelective(JobPosition record);

    int updateByPrimaryKey(JobPosition record);

    int selectPositionCountByCity(JobPosition record);
}