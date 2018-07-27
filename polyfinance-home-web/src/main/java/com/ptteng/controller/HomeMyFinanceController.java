package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: polyfinance-txj
 * @description: 我的理财、交易记录
 * @author: Yang Congcong
 * @create: 2018-07-05 14:57
 **/
@RestController
public class HomeMyFinanceController {

    /**
     * @Description: 获取已投资列表
     * @author YangCongcong 18/7/5 14:59
     * @params []
     */
    @RequestMapping(value = "/a/u/my/investeds", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getInvestedList() {
        JSONObject jsonObject = new JSONObject();

        BigDecimal expectedReturn = new BigDecimal("24.93");
        BigDecimal investment = new BigDecimal("10000.00");

        Map investedMap = new HashMap();
        investedMap.put("investId", 1);
        investedMap.put("productName", "新手礼");
        investedMap.put("whetherNewgift", 0);
        investedMap.put("annualRate", 13);
        investedMap.put("continued", 1);
        investedMap.put("investment", investment);
        investedMap.put("expectedReturn",expectedReturn);
        investedMap.put("expiryTime", "2018-06-09");

        BigDecimal expectedReturn1 = new BigDecimal("58.33");
        BigDecimal investment1 = new BigDecimal("10000.00");

        Map investedMap1 = new HashMap();
        investedMap1.put("investId", 2);
        investedMap1.put("productName", "聚月赚");
        investedMap1.put("whetherNewgift", 1);
        investedMap1.put("annualRate", 7);
        investedMap1.put("continued", 1);
        investedMap1.put("investment", investment1);
        investedMap1.put("expectedReturn",expectedReturn1);
        investedMap1.put("expiryTime", "2018-09-02");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(investedMap);
        jsonArray.add(investedMap1);

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 查看合同
     * @author YangCongcong 18/7/5 15:02
     * @params [investId]
     */
    @RequestMapping(value = "/a/u/my/invest/contract/{investId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getInvestContract(@PathVariable("investId")Long investId) {
        JSONObject jsonObject = new JSONObject();

        BigDecimal investment = new BigDecimal("10000.00");

        Map map = new HashMap();
        map.put("userName", "李小明");
        map.put("cardId", "510524199904131234");
        map.put("phoneNum", "15222223333");
        map.put("investment", investment);
        map.put("startTime", System.currentTimeMillis());

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",map);
        return jsonObject;
    }

    /**
     * @Description: 预约续投、取消续投
     * @author YangCongcong 18/7/5 15:03
     * @params []
     */
    @RequestMapping(value = "/a/u/my/invest/continued/{investId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject updataContinueState(@PathVariable("investId")Long investId) {
        JSONObject jsonObject = new JSONObject();
        Map map = new HashMap();

        int randomNum = (int) (Math.random() * 10);
        int continued;
        if((randomNum&1) != 1){
            //是偶数
            continued = 0;
        }else {
            continued = 1;
        }
        map.put("continued", continued);

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",map);
        return new JSONObject();
    }

    /**
     * @Description: 已续投列表
     * @author YangCongcong 18/7/5 15:08
     * @params []
     */
    @RequestMapping(value = "/a/u/my/continueds", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getContinuedInvest() {
        JSONObject jsonObject = new JSONObject();

        BigDecimal expectedReturn1 = new BigDecimal("58.33");
        BigDecimal investment1 = new BigDecimal("10000.00");

        Map investedMap1 = new HashMap();
        investedMap1.put("investId", 2);
        investedMap1.put("productName", "聚月赚");
        investedMap1.put("whetherNewgift", 1);
        investedMap1.put("annualRate", 7);
        investedMap1.put("continued", 1);
        investedMap1.put("investment", investment1);
        investedMap1.put("expectedReturn",expectedReturn1);
        investedMap1.put("expiryTime", System.currentTimeMillis());

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",investedMap1);
        return jsonObject;

    }

    /**
     * @Description: 已退出列表
     * @author YangCongcong 18/7/5 15:08
     * @params []
     */
    @RequestMapping(value = "/a/u/my/dropouts", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getDropoutInvest() {
        JSONObject jsonObject = new JSONObject();
        BigDecimal expectedReturn = new BigDecimal("24.93");
        BigDecimal investment = new BigDecimal("10000.00");

        Map investedMap = new HashMap();
        investedMap.put("investId", 1);
        investedMap.put("productName", "新手礼");
        investedMap.put("whetherNewgift", 0);
        investedMap.put("annualRate", 13);
        investedMap.put("continued", 1);
        investedMap.put("investment", investment);
        investedMap.put("expectedReturn",expectedReturn);
        investedMap.put("expiryTime", "2018-06-09");

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",investedMap);
        return jsonObject;

    }

    /**
     * @Description: 用户交易记录
     * @author YangCongcong 18/7/5 15:11
     * @params []
     */
    @RequestMapping(value = "/a/u/my/dealrecord", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getDealRecord() {
        JSONObject jsonObject = new JSONObject();

        BigDecimal dealAmount = new BigDecimal("10000.00");

        Map map = new HashMap();
        map.put("dealRecordId",1);
        map.put("productName", "新手礼");
        map.put("dealType",0);
        map.put("dealAmount",dealAmount);
        map.put("dealState", 0);
        map.put("dealTime", System.currentTimeMillis());

        BigDecimal dealAmount1 = new BigDecimal("10024.93");

        Map map1 = new HashMap();
        map1.put("dealRecordId",2);
        map1.put("productName", "新手礼");
        map1.put("dealType",1);
        map1.put("dealAmount",dealAmount1);
        map1.put("dealState", 0);
        map1.put("dealTime", System.currentTimeMillis());

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(map);
        jsonArray.add(map1);

        jsonObject.put("code",0);
        jsonObject.put("message","success");
        jsonObject.put("data",jsonArray);

        return jsonObject;
    }
}
