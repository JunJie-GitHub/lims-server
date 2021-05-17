package org.honma.personnel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.honma.personnel.entity.Account;
import org.honma.personnel.entity.UserInfo;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
public interface AccountService extends IService<Account> {
    List<UserInfo> getUserInfos();
}
