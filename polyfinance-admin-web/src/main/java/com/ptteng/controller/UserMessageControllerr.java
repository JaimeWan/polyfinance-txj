package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
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
 * @description: UserMessageControllerr
 * @author: Yang Congcong
 * @create: 2018-07-04 14:48
 **/
@RestController
public class UserMessageControllerr {

    /**
     * @Description: 消息列表
     * @author YangCongcong 18/7/6 15:53
     * @params [page, size]
     */
    @RequestMapping(value = "/a/u/articles", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getArticleList(Integer page,Integer size) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        List<String> createByLists = new ArrayList<>();
        createByLists.add("admin");
        createByLists.add("威斯克");

        Map articleMap = new HashMap();
        articleMap.put("articleId", 1);
        articleMap.put("articleTitle", "六一大家快乐！");
        articleMap.put("articleState", 0);
        articleMap.put("sendTime", System.currentTimeMillis());
        articleMap.put("createBy", "admin");
        articleMap.put("createAt", System.currentTimeMillis());
        articleMap.put("updateBy", "admin");
        articleMap.put("updateAt", System.currentTimeMillis());
        jsonArray.add(articleMap);

        Map articleMap1 = new HashMap();
        articleMap1.put("articleId", 2);
        articleMap1.put("articleTitle", "八一建军节");
        articleMap1.put("articleState", 1);
        articleMap1.put("sendTime", System.currentTimeMillis());
        articleMap1.put("createBy", "威斯克");
        articleMap1.put("createAt", System.currentTimeMillis());
        articleMap1.put("updateBy", "威斯克");
        articleMap1.put("updateAt", System.currentTimeMillis());
        jsonArray.add(articleMap1);


        Map dataMap = new HashMap();
        dataMap.put("total", 2);
        dataMap.put("articleList", createByLists);
        dataMap.put("createByLists", jsonArray);

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", dataMap);
        return jsonObject;
    }

    /**
     * @Description: 查询单条消息
     * @author YangCongcong 18/7/4 22:39
     * @params [articleId]
     */
    @RequestMapping(value = "/a/u/articles/{articleId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getArticle(@PathVariable("articleId")Long articleId) {
        JSONObject jsonObject = new JSONObject();

        Map articleMap = new HashMap();
        if (articleId == 1) {
            articleMap.put("articleId", 1);
            articleMap.put("articleTitle", "六一大家快乐！");
            articleMap.put("articleState", 0);
            articleMap.put("sendTime", System.currentTimeMillis());
            articleMap.put("createBy", "admin");
            articleMap.put("createAt", System.currentTimeMillis());
            articleMap.put("updateBy", "admin");
            articleMap.put("updateAt", System.currentTimeMillis());
        } else {
            articleMap.put("articleId", 2);
            articleMap.put("articleTitle", "八一建军节");
            articleMap.put("articleState", 1);
            articleMap.put("sendTime", System.currentTimeMillis());
            articleMap.put("createBy", "威斯克");
            articleMap.put("createAt", System.currentTimeMillis());
            articleMap.put("updateBy", "威斯克");
            articleMap.put("updateAt", System.currentTimeMillis());
        }

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", articleMap);
        return jsonObject;
    }

    /**
     * @Description: 消息新增
     * @author YangCongcong 18/7/4 22:35
     * @params [articleName, articleContent, articlePictureFile, sendTime, sendTarget]
     */
    @RequestMapping(value = "/a/u/article", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String articleName,String articleContent,String articlePictureFile,Long sendTime,String sendTarget) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 消息删除
     * @author YangCongcong 18/7/4 22:37
     * @params [articleId]
     */
    @RequestMapping(value = "/a/u/articles/{articleId}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("articleId")Long articleId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 消息编辑
     * @author YangCongcong 18/7/6 18:20
     * @params [articleId, articleName, articleContent, sendTime, sendTarget]
     */
    @RequestMapping(value = "/a/u/articles/{articleId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(@PathVariable("articleId")Long articleId,String articleName,String articleContent,Long sendTime,Integer sendTarget) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /** 
     * @Description: 消息取消
     * @author YangCongcong 18/7/4 22:42
     * @params [articleId]
     */
    @RequestMapping(value = "/a/u/articlestate/{articleId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToCancel(@PathVariable("articleId")Long articleId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 动态查询
     * @author YangCongcong 18/7/4 22:45
     * @params [keyWord, articleState, createBy, sendTime]
     */
    @RequestMapping(value = "/a/u/articles/keywords", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject dynamicQuery(String keyWord,Integer articleState,String createBy,Long sendTime) {
        JSONObject jsonObject = new JSONObject();

        List<String> createByList = new ArrayList<>();
        createByList.add("admin");
        createByList.add("威斯克");

        Map articleMap = new HashMap();
        articleMap.put("articleId", 1);
        articleMap.put("articleTitle", "六一大家快乐！");
        articleMap.put("articleState", 0);
        articleMap.put("sendTime", System.currentTimeMillis());
        articleMap.put("createBy", "admin");
        articleMap.put("createAt", System.currentTimeMillis());
        articleMap.put("updateBy", "admin");
        articleMap.put("updateAt", System.currentTimeMillis());
        articleMap.put("createByLists", createByList);

        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", articleMap);

        return jsonObject;
    }
}
