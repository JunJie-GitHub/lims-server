package org.honma.personnel.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.honma.personnel.entity.Teacher;
import org.honma.personnel.mapper.TeacherMapper;
import org.honma.personnel.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Object> listTutors() {
        return teacherMapper.selectObjs(new QueryWrapper<Teacher>().select("name"));
    }
}
