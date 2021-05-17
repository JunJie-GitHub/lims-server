package org.honma.personnel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.honma.personnel.entity.Account;
import org.honma.personnel.entity.UserInfo;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
public interface AccountMapper extends BaseMapper<Account> {
    List<UserInfo> getUserInfos();
}
