package com.school.mapper;

import java.util.List;

import com.school.vo.SubjectVO;
import com.school.vo.TestVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    public void insertScore(TestVO vo);
    public List<SubjectVO> subjectList();
    public List<TestVO> personalTotalScore(Integer seq);
}
