package org.honma.laboratory.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
@Data
public class Laboratory {
    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
    private String id;

    /**
     *实验室名称
     */
    private String name;

    /**
     * 实验室地址
     */
    private String address;

    /**
     * 所属院系
     */
    private String department;

    /**
     * 容纳人数
     */
    private String capacity;

    /**
     * 指导老师
     */
    private String instructor;
}
