package org.honma.laboratory.entity;

import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/5/13
 */
@Data
public class LaboratoryApplyDeal {


    /**
     * 申请人
     */
    private String student;
    /**
     * 学生学号
     */
    private String student_name;
    /**
     * 实验室名称
     */
    private String name;
    /**
     * 实验室地址
     */
    private String address;
    /**
     * 申请日期
     */
    private String date;    //用字符串, mybatisplus会自动format
    /**
     * 申请课时
     */
    private String classTime;
    /**
     * 申请理由
     */
    private String reason;
    /**
     * 申请状态
     */
    private String state;
}
