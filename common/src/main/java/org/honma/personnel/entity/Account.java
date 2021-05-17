package org.honma.personnel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
@Data
public class Account {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
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
     * 用户唯一id
     */
    private String userId;
    /**
     * 身份信息
     */
    private Integer identity;
}
