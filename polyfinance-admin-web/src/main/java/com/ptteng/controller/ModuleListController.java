package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: polyfinance-txj
 * @description: ModuleListController
 * @author: Yang Congcong
 * @create: 2018-07-04 14:46
 **/
@RestController
public class ModuleListController {
    /**
     * @Description: 获取模块列表
     * @author YangCongcong 18/7/4 19:04
     * @params []
     */
    @RequestMapping(value = "/a/u/module/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getModuleList() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("moduleID", "1");
        jsonObject1.put("moduleName", "后台管理");
        jsonObject1.put("urlAdd", "");
        jsonObject1.put("parentModuleID", "0");
        jsonObject1.put("moduleType", "web");
        jsonObject1.put("updateBy", "威斯克");
        jsonObject1.put("updateAt", "2018-4-15 16：30：00");
        jsonObject1.put("createBy", "威斯克");
        jsonObject1.put("createAt", "2018-4-15 16：30：00");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("moduleID", "2");
        jsonObject2.put("moduleName", "密码管理");
        jsonObject2.put("urlAdd", "/a/u/account/password");
        jsonObject2.put("parentModuleID", "1");
        jsonObject2.put("moduleType", "web");
        jsonObject2.put("updateBy", "威斯克");
        jsonObject2.put("updateAt", "2018-4-15 16：30：00");
        jsonObject2.put("createBy", "威斯克");
        jsonObject2.put("createAt", "2018-4-15 16：30：00");
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return  jsonObject;
    }

    /**
     * @Description: 查询
     * @author YangCongcong 18/7/4 19:55
     * @params [moduleId, moduleName, parentModuleId, cretor]
     */
    @RequestMapping(value = "/a/u/module/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getModule(String moduleId, String moduleName, String parentModuleId, String cretor) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("moduleID", "1");
        jsonObject1.put("moduleName", "后台管理");
        jsonObject1.put("urlAdd", "");
        jsonObject1.put("parentModuleID", "0");
        jsonObject1.put("moduleType", "web");
        jsonObject1.put("updateBy", "威斯克");
        jsonObject1.put("updateAt", "2018-4-15 16：30：00");
        jsonObject1.put("createBy", "威斯克");
        jsonObject1.put("createAt", "2018-4-15 16：30：00");
        jsonArray.add(jsonObject1);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return  jsonObject;
    }

    /**
     * @Description: 新增
     * @author YangCongcong 18/7/4 19:59
     * @params [moduleName, url, parentModuleId, moduleType]
     */
    @RequestMapping(value = "/a/u/module/creater", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String moduleName, String url, Long parentModuleId, String moduleType) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 更新
     * @author YangCongcong 18/7/4 20:01
     * @params [moduleId, moduleName, parentModuleId, cretor]
     */
    @RequestMapping(value = "/a/u/module/updater", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(String moduleId, String moduleName, String parentModuleId, String cretor) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/4 20:03
     * @params [id]
     */
    @RequestMapping(value = "/a/u/module/list/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("id") Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
