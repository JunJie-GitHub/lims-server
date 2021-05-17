package org.honma.equipment.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import org.honma.entity.Result;
import org.honma.equipment.entity.Equipment;
import org.honma.equipment.entity.EquipmentApplication;
import org.honma.equipment.service.EquipmentApplicationService;
import org.honma.equipment.service.EquipmentService;
import org.honma.utils.ToolUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/14
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    private static final String STATE_WAIT = "0";
    @Autowired
    EquipmentService equipmentService;

    @Autowired
    EquipmentApplicationService equipmentApplicationService;

    /**
     *
     * @return 设备列表
     */
    @RequestMapping("/listEquipment")
    @ResponseBody
    public Result listEquipment(){
        List<Equipment> equipment = equipmentService.list(null);
        return new Result(equipment);
    }

    /**
     *
     * @return 设备申请列表
     */
    @RequestMapping("/listEquipmentApplication")
    @ResponseBody
    public Result listEquipmentApplication(){
        List<EquipmentApplication> equipmentApplications = equipmentApplicationService.list(null);
        return new Result(equipmentApplications);
    }

    /**
     * 插入设备申请表
     */
    @RequestMapping(method = RequestMethod.POST, value = "/insertEquipmentApplication")
    @ResponseBody
    public Result insertEquipmentApplication(@RequestBody JSONObject param){
        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setId(ToolUtils.getUUID());
        equipmentApplication.setName(param.getStr("name"));
        equipmentApplication.setStudentName(param.getStr("studentName"));
        equipmentApplication.setEquipmentName(param.getStr("equipmentName"));
        equipmentApplication.setExperimentContext(param.getStr("experimentContext"));
        equipmentApplication.setExperimentPurpose(param.getStr("experimentPurpose"));
        equipmentApplication.setStartTime( DateUtil.formatDateTime(
                DateUtil.parse(param.getStr("startTime"))));
        equipmentApplication.setEndTime( DateUtil.formatDateTime(
                DateUtil.parse(param.getStr("endTime"))));
        equipmentApplication.setTutor(param.getStr("tutor"));
        equipmentApplication.setState(STATE_WAIT);
        equipmentApplicationService.save(equipmentApplication);
        return new Result();
    }

    /**
     * 设备名列表
     * @return
     */
    @RequestMapping("/listEquipmentName")
    @ResponseBody
    public Result listEquipmentName(){
        List<Object> list= equipmentService.listEquipmentNames();
        return new Result(list);
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(ToolUtils.getUUID());
//        }
//    }
}
