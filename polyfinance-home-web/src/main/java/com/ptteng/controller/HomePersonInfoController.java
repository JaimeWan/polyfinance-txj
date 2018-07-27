package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: polyfinance-txj
 * @description: 前台用户个人信息
 * @author: Yang Congcong
 * @create: 2018-07-05 13:32
 **/
@RestController
public class HomePersonInfoController {

    /**
     * @Description: 获取个人信息
     * @author YangCongcong 18/7/5 13:37
     * @params []
     */
    @RequestMapping(value = "/a/u/home/my/info", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getPersonInfo() {
        return new JSONObject();
    }

    /**
     * @Description: 填写银行预留手机号
     * @author YangCongcong 18/7/5 13:45
     * @params [userName, cardId, bankCard]
     */
    @RequestMapping(value = "/a/u/home/my/info/bankphone", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject fillBankPhone(String userName, String cardId, String bankCard) {
        return new JSONObject();
    }

    /**
     * @Description: 验证用户手机号
     * @author YangCongcong 18/7/5 13:49
     * @params [bankPhone, bankId]
     */
    @RequestMapping(value = "/a/u/home/my/info/verifypage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject verifyPhone(String bankPhone, Long bankId) {
        return new JSONObject();
    }

    /**
     * @Description: 确认短息验证码是否正确
     * @author YangCongcong 18/7/5 13:52
     * @params [verifyCode]
     */
    @RequestMapping(value = "/a/u/home/my/info/code", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject confirmCode(Integer verifyCode) {
        return new JSONObject();
    }

    /**
     * @Description: 更换新手机
     * @author YangCongcong 18/7/5 13:56
     * @params [newPhoneNum, newCode]
     */
    @RequestMapping(value = "/a/u/home/my/info/newnum", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject confirmNewPhone(String newPhoneNum,Integer newCode) {
        return new JSONObject();
    }

    /**
     * @Description: 用户修改密码(杨)
     * @author YangCongcong 18/7/5 14:03
     * @params [oldPwd, newPwd]
     */
    @RequestMapping(value = "/a/u/my/setup/changepwd", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject changePassword(String oldPwd,String newPwd) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

}
