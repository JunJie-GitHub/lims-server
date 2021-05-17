package org.honma.personnel.controller;

import org.honma.entity.Result;
import org.honma.personnel.entity.Account;
import org.honma.personnel.service.AccountService;
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
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    /**
     * 账户列表
     */
    @RequestMapping("/listAccount")
    @ResponseBody
    public Result listTutors(){
        List<Account> accountList = accountService.list();
        return new Result(accountList);
    }

}
