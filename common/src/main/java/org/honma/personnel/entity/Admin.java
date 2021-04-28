package org.honma.personnel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/4/15
 */
@Data
@TableName("admin")
public class Admin {

    /**
     * 主键id
     */
    @TableId(type = IdType.INPUT)
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 邮件
     */
    private String email;
}
