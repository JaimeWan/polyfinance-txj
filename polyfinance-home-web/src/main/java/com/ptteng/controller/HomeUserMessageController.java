package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: polyfinance-txj
 * @description: 我的首页、消息中心、意见反馈
 * @author: Yang Congcong
 * @create: 2018-07-05 14:50
 **/
@RestController
public class HomeUserMessageController {

    /**
     * @Description: 我的账户首页，返回未读消息条数
     * @author YangCongcong 18/7/5 14:52
     * @params []
     */
    @RequestMapping(value = "/a/u/my", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUserGenerealInfo() {
        JSONObject jsonObject = new JSONObject();

        BigDecimal userAssets = new BigDecimal("20000.00");

        Map map3 = new HashMap();
        map3.put("userName", "李小明");
        map3.put("phoneNum", "13155556666");
        map3.put("unreadMessages", 3);
        map3.put("userAssets", userAssets);

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", map3);
        return jsonObject;
    }

    /**
     * @Description: 消息中心（需要按时间排序）
     * @author YangCongcong 18/7/5 14:53
     * @params []
     */
    @RequestMapping(value = "/a/u/my/articles", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getArticleList() {
        JSONObject jsonObject = new JSONObject();
        Map articleMap = new HashMap();
        articleMap.put("articleId",1);
        articleMap.put("articleState",1);
        articleMap.put("articleType",1);
        articleMap.put("articleTitle"," 意见反馈回复通知。");
        articleMap.put("sendTime",System.currentTimeMillis());

        Map articleMap1 = new HashMap();
        articleMap1.put("articleId",1);
        articleMap1.put("articleState",0);
        articleMap1.put("articleType",0);
        articleMap1.put("articleTitle"," 版本更新通知");
        articleMap1.put("sendTime",System.currentTimeMillis());

        Map articleMap11 = new HashMap();
        articleMap11.put("articleId",2);
        articleMap11.put("articleState",0);
        articleMap11.put("articleType",0);
        articleMap11.put("articleTitle"," 六一欢聚，孩童欢乐！");
        articleMap11.put("sendTime",System.currentTimeMillis());

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(articleMap);
        jsonArray.add(articleMap1);
        jsonArray.add(articleMap11);

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 查询具体消息
     * @author YangCongcong 18/7/5 14:54
     * @params []
     */
    @RequestMapping(value = "/a/u/my/articles/{articleType}/{articleId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getArticle(@PathVariable("articleType")Integer articleType,@PathVariable("articleId")Long articleId) {
        JSONObject jsonObject = new JSONObject();

        Map map = new HashMap();
        map.put("articleTitle", "六一欢聚，孩童欢乐！");
        map.put("articleContent", "喜迎六一儿童节，聚金融恭祝合家欢乐！");
        map.put("articlePicture", "https://yangcongcong007.oss-cn-shenzhen.aliyuncs.com/1526297446104.jpg");

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data",map);
        return jsonObject;
    }

    /**
     * @Description: 意见反馈
     * @author YangCongcong 18/7/5 15:56
     * @params []
     */
    @RequestMapping(value = "/a/u/my/suggestion", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject submitOpinion() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
