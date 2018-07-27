package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.model.CardsList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: polyfinance-txj
 * @description: 用户银行卡
 * @author: Yang Congcong
 * @create: 2018-07-05 15:12
 **/

@RestController
public class HomeBankCardController {


    /**
     * @Description: 银行卡列表
     * @author YangCongcong 18/7/5 15:14
     * @params []
     */
    @RequestMapping(value = "/a/u/home/my/bankcards", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getBankCardList() {
        List<CardsList> data = new ArrayList<>();
        CardsList cardsList = new CardsList();
        cardsList.setId(1L);
        cardsList.setBankCard("62220223120000667987");
        cardsList.setBankCard("中国公司银行储蓄卡");
        data.add(cardsList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "success");
        jsonObject.put("data", data);
        return jsonObject;
    }

    /**
     * @Description: 添加银行卡
     * @author YangCongcong 18/7/5 15:42
     * @params []
     */
    @RequestMapping(value = "/a/u/home/my/bankcard", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject addBankCard(  String bankCard, String bankType) {
        if (bankCard!=null&&bankType!=null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 200);
            jsonObject.put("message", "success");
            return jsonObject;
        }

      else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 4002);
            jsonObject.put("message", "fail");
            return jsonObject;
        }

    }

    /**
     * @Description: 查询单个银行卡
     * @author YangCongcong 18/7/5 15:44
     * @params [bankId]
     */
    @RequestMapping(value = "/a/u/home/my/bankcards/{bankId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getBankCard(@PathVariable("bankId")Long bankId) {
        List<CardsList> data = new ArrayList<>();
        CardsList cardsList = new CardsList();
        cardsList.setId(1L);
        cardsList.setBankCard("62220223120000667987");
        cardsList.setBankCard("中国公司银行储蓄卡");
        data.add(cardsList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "success");
        jsonObject.put("data", data);
        return jsonObject;
    }

    /**
     * @Description: 解绑银行卡
     * @author YangCongcong 18/7/5 15:46
     * @params [bankId]
     */
    @RequestMapping(value = "/a/u/home/my/bankcards/{bankId}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject deleteBankCard(@PathVariable("bankId") Long bankId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
