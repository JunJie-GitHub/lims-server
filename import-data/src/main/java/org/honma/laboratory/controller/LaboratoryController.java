package org.honma.laboratory.controller;

import org.honma.entity.Result;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
@Controller
@RequestMapping("/laboratory")
public class LaboratoryController {
    @Autowired
    LaboratoryService laboratoryService;

    /**
     * @return  所有设备信息列表
     */
    @RequestMapping("/listLaboratorys")
    @ResponseBody
    public Result listLaboratorys(){
        List<Laboratory> laboratories = laboratoryService.selectList(null);
        return new Result(laboratories);
    }
}
