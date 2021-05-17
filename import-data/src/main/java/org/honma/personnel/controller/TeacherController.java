package org.honma.personnel.controller;

import org.honma.entity.Result;
import org.honma.personnel.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    /**
     * 指导老师列表
     */
    @RequestMapping("/listTutors")
    @ResponseBody
    public Result listTutors(){
        List<Object> list= teacherService.listTutors();
        return new Result(list);
    }
}
