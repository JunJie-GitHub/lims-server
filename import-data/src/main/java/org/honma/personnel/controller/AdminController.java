package org.honma.personnel.controller;

import cn.hutool.json.JSONObject;
import org.honma.entity.Result;
import org.honma.personnel.entity.Admin;
import org.honma.personnel.entity.UserInfo;
import org.honma.personnel.service.AccountService;
import org.honma.personnel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/4/22
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AccountService accountService;
    /**
     * (测试)
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello World!!";
    }

    /**
     * 登录
     * @param param
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/loginValid")
    @ResponseBody
    public Result loginValid(@RequestBody JSONObject param){
        List<Admin> admins = adminService.list(null);
        String msg = null;
        String username = param.getStr("account");
        String password = param.getStr("password");
        HashMap<String, Object> map = new HashMap<>();
        map.put("isfirstlogin", 0);
        map.put("token", "fdsafsad434325423");
        if (adminService.loginValid(username, password)){
            return new Result(map);
        }else {
            return new Result();
        }
    }

    /**
     * 登录信息
     */
//    @RequestMapping("/loginValid")
//    @ResponseBody
//    public Result userMsg(@RequestBody JSONObject param){
//
//    }
    /**
     * 所有用户信息
     */
    @RequestMapping(method = RequestMethod.POST, value ="/listUserInfos")
    @ResponseBody
    public Result listUserInfos(){
        List<UserInfo> userInfos = accountService.getUserInfos();
        return new Result(userInfos);
    }

}
