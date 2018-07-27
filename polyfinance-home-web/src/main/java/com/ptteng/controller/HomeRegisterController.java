package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: polyfinance-txj
 * @description: 前台用户注册、登录等
 * @author: Yang Congcong
 * @create: 2018-07-05 14:15
 **/
@RestController
public class HomeRegisterController {


    /**
     * @Description: 用户注册
     * @author YangCongcong 18/7/5 14:18
     * @params [phoneNum, pwd]
     */
    @RequestMapping(value = "/a/u/home/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject userRegistrat(String phoneNum,String pwd) {
        return new JSONObject();
    }

    /**
     * @Description: 用户登录
     * @author YangCongcong 18/7/5 14:19
     * @params [phoneNum, pwd]
     */
    @RequestMapping(value = "/a/u/home/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject userLogin(String phoneNum,String pwd) {
        return new JSONObject();
    }

    /**
     * @Description: 用户找回密码
     * @author YangCongcong 18/7/5 14:21
     * @params [phoneNum, pwd]
     */
    @RequestMapping(value = "/a/u/home/my/forget", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject retrievePassword(String phoneNum,String pwd) {
        return new JSONObject();
    }

}
