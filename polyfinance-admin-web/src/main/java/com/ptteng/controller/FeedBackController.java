package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
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
 * @description: FeedBackController 意见反馈
 * @author: Yang Congcong
 * @create: 2018-07-04 14:46
 **/
@RestController
public class FeedBackController {


    /**
     * @Description: 意见列表
     * @author YangCongcong 18/7/5 9:19
     * @params []
     */
    @RequestMapping(value = "/a/u/opinions", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getOpinionList() {
        JSONObject jsonObject = new JSONObject();

        Map opinionMap = new HashMap();
        opinionMap.put("opinionId", 1);
        opinionMap.put("opinionContent", "我要100万");
        opinionMap.put("opinionState", 1);
        opinionMap.put("submitBy", "李小明");
        opinionMap.put("phoneNum", "13255558888");
        opinionMap.put("submitTime", System.currentTimeMillis());
        opinionMap.put("replyBy", null);
        opinionMap.put("replyAt", null);

        Map opinionMap2 = new HashMap();
        opinionMap2.put("opinionId", 2);
        opinionMap2.put("opinionContent", "我要1个亿");
        opinionMap2.put("opinionState", 0);
        opinionMap2.put("submitBy", "网瘾少年");
        opinionMap2.put("phoneNum", "13252158888");
        opinionMap2.put("submitTime", System.currentTimeMillis());
        opinionMap2.put("replyBy", "admin");
        opinionMap2.put("replyAt", System.currentTimeMillis());

        List<Map> opinionList = new ArrayList<>();
        opinionList.add(opinionMap);
        opinionList.add(opinionMap2);

        Map dataMap = new HashMap();
        dataMap.put("total", 2);
        dataMap.put("opinionList",opinionList);

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", dataMap);
        return jsonObject;
    }

    /**
     * @Description:  查询单条意见
     * @author YangCongcong 18/7/5 9:21
     * @params [opinionId]
     */
    @RequestMapping(value = "/a/u/opinions/{opinionId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getOpinion(@PathVariable("opinionId")Long opinionId) {
        JSONObject jsonObject = new JSONObject();
        Map map = new HashMap();

        if (opinionId == 2) {
            map.put("opinionId", 2);
            map.put("opinionContent", "我要1个亿");
            map.put("submitBy", "网瘾少年");
            map.put("submitTime", System.currentTimeMillis());

            map.put("replyBy", "admin");
            map.put("replyAt", System.currentTimeMillis());
            map.put("feedBackContent", "鲸鱼？？");
        }

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", map);

        return jsonObject;
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/5 9:22
     * @params [opinionId]
     */
    @RequestMapping(value = "/a/u/opinions/{opinionId}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("opinionId")Long opinionId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 意见回复
     * @author YangCongcong 18/7/5 9:24
     * @params [opinionId, feedBackContent]
     */
    @RequestMapping(value = "/a/u/opinions/{opinionId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject replyToOpinion(@PathVariable("opinionId")Long opinionId,String feedBackContent) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");

        return jsonObject;
    }

    /**
     * @Description: 动态查询
     * @author YangCongcong 18/7/5 9:27
     * @params [opinionNum, submitBy, keyword, phoneNum]
     */
    @RequestMapping(value = "/a/u/opinions/keywords", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject dynamicQuery(String opinionNum,String submitBy,String keyword,String phoneNum) {
        JSONObject jsonObject = new JSONObject();

        Map opinionMap2 = new HashMap();
        opinionMap2.put("opinionId", 2);
        opinionMap2.put("opinionContent", "我要1个亿");
        opinionMap2.put("opinionState", 0);
        opinionMap2.put("submitBy", "网瘾少年");
        opinionMap2.put("phoneNum", "13252158888");
        opinionMap2.put("submitTime", System.currentTimeMillis());
        opinionMap2.put("replyBy", "admin");
        opinionMap2.put("replyAt", System.currentTimeMillis());

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", opinionMap2);
        return jsonObject;
    }
}
