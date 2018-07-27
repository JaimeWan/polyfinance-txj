package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: polyfinance-txj
 * @description: 前台通用接口、退出登录
 * @author: Yang Congcong
 * @create: 2018-07-05 14:05
 **/
@RestController
public class HomeGeneralController {

    /**
     * @Description: 前台首页
     * @author YangCongcong 18/7/5 14:24
     * @params []
     */
    @RequestMapping(value = "/a/u/home/index", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getIndex() {
        return new JSONObject();
    }

    /**
     * @Description: 手机短信验证码发送
     * @author YangCongcong 18/7/5 14:07
     * @params [phoneNum]
     */
    @RequestMapping(value = "/a/u/home/sendcode", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject sendVerifyCode(String phoneNum) {
        return new JSONObject();
    }

    /**
     * @Description: 图片验证码生成
     * @author YangCongcong 18/7/5 14:09
     * @params [phoneNum]
     */
    @RequestMapping(value = "/a/u/home/pverify", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject generateImageCode(String phoneNum) {
        return new JSONObject();
    }

    /**
     * @Description: 注册手机验证码 验证
     * @author YangCongcong 18/7/5 14:14
     * @params [phoneNum, verifyCode]
     */
    @RequestMapping(value = "/a/u/home/verify", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject registVerify(String phoneNum,Integer verifyCode) {
        return new JSONObject();
    }

    /**
     * @Description: 退出登录
     * @author YangCongcong 18/7/7 11:19
     * @params []
     */
    @RequestMapping(value = "/a/u/login", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject logout() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message","success");
        return jsonObject;
    }

}
