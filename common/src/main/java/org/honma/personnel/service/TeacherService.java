package org.honma.personnel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.honma.personnel.entity.Teacher;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
public interface TeacherService extends IService<Teacher> {
    List<Object> listTutors();
}
