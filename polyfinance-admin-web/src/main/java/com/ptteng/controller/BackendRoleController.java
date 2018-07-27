package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: polyfinance-txj
 * @description: BackendRoleController 后台角色管理
 * @author: Yang Congcong
 * @create: 2018-07-04 14:45
 **/
@RestController
public class BackendRoleController {

    /**
     * @Description: 获取角色列表
     * @author YangCongcong 18/7/4 20:16
     * @params []
     */
    @RequestMapping(value = "/a/u/role/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getRoleList() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("roleID", "1");
        jsonObject1.put("roleName", "超级管理员");
        jsonObject1.put("updateBy", "威斯克");
        jsonObject1.put("updateAt", "2018-4-15 16：30：00");
        jsonObject1.put("createBy", "威斯克");
        jsonObject1.put("createAt", "2018-4-15 16：30：00");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("roleID", "2");
        jsonObject2.put("roleName", "管理员");
        jsonObject2.put("updateBy", "威斯克");
        jsonObject2.put("updateAt", "2018-4-15 16：30：00");
        jsonObject2.put("createBy", "威斯克");
        jsonObject2.put("createAt", "2018-4-15 16：30：00");
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("roleID", "3");
        jsonObject3.put("roleName", "运营");
        jsonObject3.put("updateBy", "威斯克");
        jsonObject3.put("updateAt", "2018-4-15 16：30：00");
        jsonObject3.put("createBy", "威斯克");
        jsonObject3.put("createAt", "2018-4-15 16：30：00");
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 查询
     * @author YangCongcong 18/7/4 20:34
     * @params [id, role, createBy, updateBy]
     */
    @RequestMapping(value = "/a/u/role/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getRole(Long id, String role, String createBy, String updateBy) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("roleID", "1");
        jsonObject1.put("roleName", "超级管理员");
        jsonObject1.put("updateBy", "威斯克");
        jsonObject1.put("updateAt", "2018-4-15 16：30：00");
        jsonObject1.put("createBy", "威斯克");
        jsonObject1.put("createAt", "2018-4-15 16：30：00");
        jsonArray.add(jsonObject1);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 新增
     * @author YangCongcong 18/7/4 20:40
     * @params [soleName, moduleId]
     */
    @RequestMapping(value = "/a/u/role/creater", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String soleName,List<Long> moduleId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 编辑
     * @author YangCongcong 18/7/4 20:43
     * @params [roleName, moduleId]
     */
    @RequestMapping(value = "/a/u/role/updater", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(String roleName,List<Long> moduleId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/4 20:45
     * @params [id]
     */
    @RequestMapping(value = "/a/u/role/list/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("id")Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
