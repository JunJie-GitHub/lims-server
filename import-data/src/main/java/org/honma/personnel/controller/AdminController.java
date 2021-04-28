package org.honma.personnel.controller;

import org.honma.personnel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: lijunjie
 * @Date: 2021/4/22
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello World!!";
    }

    @RequestMapping("listAdmin")
    @ResponseBody
    public  listAdmin(){
        return adminService.selectList(null);
    }
}
