package org.honma.laboratory.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import org.honma.entity.Result;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.entity.LaboratoryApply;
import org.honma.laboratory.entity.LaboratoryApplyState;
import org.honma.laboratory.service.LaboratoryApplyService;
import org.honma.laboratory.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
@Controller
@RequestMapping("/laboratory")
public class LaboratoryController {
    private static final String STATUS = "0";
    @Autowired
    LaboratoryService laboratoryService;

    @Autowired
    LaboratoryApplyService laboratoryApplyService;
    /**
     * @return  所有实验室信息列表
     */
    @RequestMapping("/listLaboratorys")
    @ResponseBody
    public Result listLaboratorys(){
        List<Laboratory> laboratories = laboratoryService.list(null);
        return new Result(laboratories);
    }

    /**
     * 插入实验室申请表
     */
    @RequestMapping(method = RequestMethod.POST, path = "/insertApply")
    @ResponseBody
    public Result insertApply(@RequestBody JSONObject param){
//        String id = ToolUtils.getUUID();
        String name = param.getStr("name");
        Date date = DateUtil.parse(param.getStr("date")); //申请日期
        String classTime = param.getStr("classTime");//申请时间
        String reason = param.getStr("reason"); //申请理由

        Result result = new Result();
        if (name == null || "".equals(name)){
            result.setSuccess(false);
            result.setMessage("实验室名称不能为空!");
            return result;
        }
        if (date == null || "".equals(reason)){
            result.setSuccess(false);
            result.setMessage("申请日期不能为空!");
            return result;
        }
        if (classTime == null || "[]".equals(classTime)){
            result.setSuccess(false);
            result.setMessage("申请课时不能为空!");
            return result;
        }
        if (reason == null || "".equals(reason)){
            result.setSuccess(false);
            result.setMessage("申请理由不能为空!");
            return result;
        }
//        String state = param.getStr("state");   //状态
        laboratoryService.insertLaboratoryApplication(name, date, classTime, reason, STATUS);
        return result;
    }

    /**
     * 实验室申请查询
     * @return  指定学生的实验室申请信息
     */
    @RequestMapping("/listLaboratoryApply")
    @ResponseBody
    public Result listLaboratoryApply(){
        List<LaboratoryApplyState> laboratories = laboratoryService.getAllLaboratoryState();
        return new Result(laboratories);
    }

    @RequestMapping("/listLaboratoryApplyToDealWith")
    @ResponseBody
    public Result listLaboratoryApplyToDealWith(){
        List<LaboratoryApply> laboratoryApplies = laboratoryApplyService.list(null);
        return new Result(laboratoryApplies);
    }

}
