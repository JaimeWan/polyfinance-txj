package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: polyfinance-txj  管理前台用户
 * @description: UserController
 * @author: Yang Congcong
 * @create: 2018-07-04 14:47
 **/
@RestController
public class UserController {

    /**
     * @Description: 前台用户列表
     * @author YangCongcong 18/7/5 9:37
     * @params []
     */
    @RequestMapping(value = "/a/u/user/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUserList() {
        JSONObject jsonObject = new JSONObject();
        Map map = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        Map<String, String> accountListMap1 = new HashMap<>();
        accountListMap1.put("id", "1");
        accountListMap1.put("phoneNum", "13366660608");
        accountListMap1.put("actualName", "王尼玛");
        accountListMap1.put("cardID", "36242219851212000X");
        accountListMap1.put("totalAssets", "20000.00");
        accountListMap1.put("cumulativeIncome", "24.93");
        accountListMap1.put("createAt", "2018-4-15 16：30：00");
        accountListMap1.put("state", "0");
        jsonArray.add(accountListMap1);
        Map<String, String> accountListMap2 = new HashMap<>();
        accountListMap2.put("id", "2");
        accountListMap2.put("phoneNum", "12345678900");
        accountListMap2.put("actualName", "——");
        accountListMap2.put("cardID", "——");
        accountListMap2.put("totalAssets", "0.00");
        accountListMap2.put("cumulativeIncome", "0.00");
        accountListMap2.put("createAt", "2018-4-15 16：30：00");
        accountListMap2.put("state", "1");
        jsonArray.add(accountListMap2);
        map.put("accountList",jsonArray);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", map);
        return jsonObject;
    }

    /**
     * @Description: 查询单个用户
     * @author YangCongcong 18/7/5 9:40
     * @params [userId, actualName, phoneNum, state]
     */
    @RequestMapping(value = "/a/u/user/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUser(Long userId,String actualName,String phoneNum,Integer state) {
        JSONObject jsonObject = new JSONObject();
        Map map = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        Map<String, String> accountListMap1 = new HashMap<>();
        accountListMap1.put("id", "1");
        accountListMap1.put("phoneNum", "13366660608");
        accountListMap1.put("actualName", "王尼玛");
        accountListMap1.put("cardID", "36242219851212000X");
        accountListMap1.put("totalAssets", "20000.00");
        accountListMap1.put("cumulativeIncome", "24.93");
        accountListMap1.put("createAt", "2018-4-15 16：30：00");
        accountListMap1.put("state", "0");
        jsonArray.add(accountListMap1);
        map.put("accountList",jsonArray);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", map);
        return jsonObject;
    }

    /**
     * @Description: 冻结、解冻
     * @author YangCongcong 18/7/5 9:42
     * @params [state]
     */
    @RequestMapping(value = "/a/u/user/frozen", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject frozenUser(Integer state) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 查看用户详情
     * @author YangCongcong 18/7/5 9:43
     * @params []
     */
    @RequestMapping(value = "/a/u/user/details", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUserDetail() {
        JSONObject jsonObject = new JSONObject();
        JSONObject details = new JSONObject();
        JSONObject card1 = new JSONObject();
        JSONObject card2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        Map map = new HashMap();
        details.put("id", "1");
        details.put("phoneNum", "13366660608");
        details.put("actualName", "王尼玛");
        details.put("totalAssets", "20000.00");
        details.put("cumulativeIncome", "24.93");
        details.put("createAt", "2018-4-15 16：30：00");
        details.put("state", "0");
        map.put("accountList", details);
        card1.put("cardID", "36242219851212000X");
        card1.put("bankType", "0102");
        jsonArray.add(card1);
        card2.put("cardID", "36295863851305800X");
        card2.put("bankType", "0105");
        jsonArray.add(card2);
        map.put("bankCardList", jsonArray);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", map);
        return jsonObject;
    }

    /**
     * @Description: 管理员更换用户手机号
     * @author YangCongcong 18/7/5 9:48
     * @params [phoneNum, verify]
     */
    @RequestMapping(value = "/a/u/account/phonenum", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject changePhoneNum(String phoneNum,Integer verify) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 获取用户交易记录
     * @author YangCongcong 18/7/5 9:52
     * @params []
     */
    @RequestMapping(value = "/a/u/user/trade", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUserTransactionRecord() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        Map card1 = new HashMap();
        jsonObject1.put("id", "1");
        jsonObject1.put("actualName", "王尼玛");
        jsonObject1.put("phoneNum", "13366660608");
        jsonObject1.put("productName", "新手礼");
        jsonObject1.put("investmentMoney", "10000.00");
        jsonObject1.put("transactionTime", "2018-4-15 16：30：00");
        jsonObject1.put("transactionType", "1");
        jsonObject1.put("state", "0");
        jsonObject1.put("cardID", "36242219851212000X");
        jsonObject1.put("bankType", "0102");
        jsonArray.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", "2");
        jsonObject2.put("actualName", "王尼玛");
        jsonObject2.put("phoneNum", "13366660608");
        jsonObject2.put("productName", "聚月赚");
        jsonObject2.put("investmentMoney", "10000.00");
        jsonObject2.put("transactionTime", "2018-4-15 16：30：00");
        jsonObject2.put("transactionType", "0");
        jsonObject2.put("state", "0");
        jsonObject2.put("cardID", "36242219851212000X");
        jsonObject2.put("bankType", "0105");
        jsonArray.add(jsonObject2);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 查看用户投资合同列表
     * @author YangCongcong 18/7/5 10:08
     * @params []
     */
    @RequestMapping(value = "/a/u/user/contract/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject viewInvestContract() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id", "1");
        jsonObject1.put("actualName", "王尼玛");
        jsonObject1.put("phoneNum", "13366660608");
        jsonObject1.put("productName", "新手礼");
        jsonObject1.put("investmentMoney", "10000.00");
        jsonObject1.put("expectedEarning", "24.93");
        jsonObject1.put("effectiveTime", "2018-4-15 16：30：00");
        jsonObject1.put("expirationTime", "2018-4-21 16：30：00");
        jsonObject1.put("state", "1");
        jsonArray.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", "1");
        jsonObject2.put("actualName", "王尼玛");
        jsonObject2.put("phoneNum", "13366660608");
        jsonObject2.put("productName", "聚月赚");
        jsonObject2.put("investmentMoney", "10000.00");
        jsonObject2.put("expectedEarning", "58.33");
        jsonObject2.put("effectiveTime", "2018-4-15 16：30：00");
        jsonObject2.put("expirationTime", "——");
        jsonObject2.put("state", "0");
        jsonArray.add(jsonObject2);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 查看用户投资合同详情
     * @author YangCongcong 18/7/5 10:11
     * @params []
     */
    @RequestMapping(value = "/a/u/user/contract/details", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject viewContractDetails() {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("actualName", "王尼玛");
        jsonObject1.put("cardID", "36242219851212000X");
        jsonObject1.put("phoneNum", "13366660608");
        jsonObject1.put("investmentMoney", "10000.00");
        jsonObject1.put("createAt", "2018-4-15 16：30：00");
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonObject1);
        return jsonObject;
    }
}
