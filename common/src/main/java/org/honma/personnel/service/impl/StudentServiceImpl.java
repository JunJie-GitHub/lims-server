package org.honma.personnel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.honma.personnel.entity.Student;
import org.honma.personnel.mapper.StudentMapper;
import org.honma.personnel.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
