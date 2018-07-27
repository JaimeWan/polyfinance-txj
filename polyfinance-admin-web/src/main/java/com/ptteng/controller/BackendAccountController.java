package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: polyfinance-txj
 * @description: BackendAccountController 后台管理
 * @author: Yang Congcong
 * @create: 2018-07-04 14:45
 **/
@RestController
public class BackendAccountController {
    /**
     * @Description: 后台修改密码
     * @author YangCongcong 18/7/4 17:29
     * @params [oldPassword, newPassword]
     */
    @RequestMapping(value = "/a/u/account/password", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject changePassword(String oldPassword, String newPassword) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 获取后台账户列表
     * @author YangCongcong 18/7/4 17:29
     * @params []
     */
    @RequestMapping(value = "/a/u/account/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getAccountList() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        Map map = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        Map<String, String> accountListMap1 = new HashMap<>();
        accountListMap1.put("id", "1");
        accountListMap1.put("account", "admin");
        accountListMap1.put("role", "超级管理员");
        accountListMap1.put("createBy", "admin");
        accountListMap1.put("createAt", "2018/05/10 21：30：12");
        accountListMap1.put("updateBy", "admin");
        accountListMap1.put("updateAt", "2018/05/10 22：20：39");
        accountListMap1.put("state", "0");
        //map.put("accountList1", accountListMap1);
        jsonArray.add(accountListMap1);
        Map<String, String> accountListMap2 = new HashMap<>();
        accountListMap2.put("id", "2");
        accountListMap2.put("account", "威斯克");
        accountListMap2.put("role", "管理员");
        accountListMap2.put("createBy", "admin");
        accountListMap2.put("createAt", "2018/05/10 21：30：12");
        accountListMap2.put("updateBy", "admin");
        accountListMap2.put("updateAt", "2018/05/10 22：20：39");
        accountListMap2.put("state", "1");
        //map.put("accountList2", accountListMap2);
        jsonArray.add(accountListMap2);
        List<String> roles = new ArrayList<>();
        roles.add("超级管理员");
        roles.add("管理员");
        roles.add("运营");
        roles.add("客服");
        map.put("roles",roles);
        map.put("accountList",jsonArray);
        jsonObject.put("data", map);
        return jsonObject;
    }

    /**
     * @Description: 查询单个账户
     * @author YangCongcong 18/7/4 17:26
     * @params [id, role, account, founder]
     */
    @RequestMapping(value = "/a/u/account/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getAccount(String id, String role, String account, String founder) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        Map map = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        Map<String, String> accountListMap1 = new HashMap<>();
        accountListMap1.put("id", "1");
        accountListMap1.put("account", "admin");
        accountListMap1.put("role", "超级管理员");
        accountListMap1.put("createBy", "admin");
        accountListMap1.put("createAt", "2018/05/10 21：30：12");
        accountListMap1.put("updateBy", "admin");
        accountListMap1.put("updateAt", "2018/05/10 22：20：39");
        accountListMap1.put("state", "0");
        jsonArray.add(accountListMap1);
        List<String> roles = new ArrayList<>();
        roles.add("超级管理员");
        roles.add("管理员");
        roles.add("运营");
        roles.add("客服");
        map.put("roles",roles);
        map.put("accountList",jsonArray);
        jsonObject.put("data", map);
        return jsonObject;

    }

    /**
     * @Description: 新增
     * @author YangCongcong 18/7/4 17:33
     * @params [account, password, roleid, state]
     */
    @RequestMapping(value = "/a/u/account/search", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String account, String password, Long roleid, Integer state) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 编辑
     * @author YangCongcong 18/7/4 18:49
     * @params [accout, password, roleid, state]
     */
    @RequestMapping(value = "/a/u/account/updater", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(String accout, String password, Long roleid, Integer state) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/4 18:54
     * @params [id]
     */
    @RequestMapping(value = "/a/u/account/list/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("id") Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
