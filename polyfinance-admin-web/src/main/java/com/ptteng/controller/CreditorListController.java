package com.ptteng.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: polyfinance-txj
 * @description: CreditorListController 债权管理
 * @author: Yang Congcong
 * @create: 2018-07-04 14:46
 **/
@RestController
public class CreditorListController {


    /**
     * @Description: 债权管理列表
     * @author YangCongcong 18/7/5 10:15
     * @params []
     */
    @RequestMapping(value = "/a/u/creditor/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getCreditorList() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id", "1");
        jsonObject1.put("enterpriseName", "涌动公司");
        jsonObject1.put("creditor", "赵菊");
        jsonObject1.put("phoneNum", "13388880806");
        jsonObject1.put("cardID", "36242212345678900X");
        jsonObject1.put("loanAmount", "200000.00");
        jsonObject1.put("loanPeriod", "3");
        jsonObject1.put("loanAt", "2018/05/30 0：00：00");
        jsonObject1.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject1.put("contractId", "1");
        jsonObject1.put("investment", "10000.00");
        jsonObject1.put("productTerm", "7");
        jsonObject1.put("sruplusAmount", "0.00");
        jsonObject1.put("state", "0");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", "2");
        jsonObject2.put("enterpriseName", "潮汐公司");
        jsonObject2.put("creditor", "黄明");
        jsonObject2.put("phoneNum", "13388880806");
        jsonObject2.put("cardID", "36242212345678900X");
        jsonObject2.put("loanAmount", "300000.00");
        jsonObject2.put("loanPeriod", "3");
        jsonObject2.put("loanAt", "2018/05/30 0：00：00");
        jsonObject2.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject2.put("contractId", "2");
        jsonObject2.put("investment", "10000.00");
        jsonObject2.put("productTerm", "90");
        jsonObject2.put("sruplusAmount", "290000.00");
        jsonObject2.put("state", "1");
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("id", "3");
        jsonObject3.put("enterpriseName", "自然美公司");
        jsonObject3.put("creditor", "刘淳");
        jsonObject3.put("phoneNum", "13388880806");
        jsonObject3.put("cardID", "36242212345678900X");
        jsonObject3.put("loanAmount", "300000.00");
        jsonObject3.put("loanPeriod", "3");
        jsonObject3.put("loanAt", "2018/05/30 0：00：00");
        jsonObject3.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject3.put("contractId", "——");
        jsonObject3.put("investment", "——");
        jsonObject3.put("productTerm", "——");
        jsonObject3.put("sruplusAmount", "300000.00");
        jsonObject3.put("state", "2");
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 动态查询
     * @author YangCongcong 18/7/5 10:19
     * @params [creditorNum, enterpriseName, creditor, state]
     */
    @RequestMapping(value = "/a/u/creditor/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject dynamicQuery(Long creditorNum,String enterpriseName,String creditor,Integer state) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 新增
     * @author YangCongcong 18/7/5 10:27
     * @params [enterpriseName, creditor, phoneNum, cardId, LoanTime, loanAmount, loanPeriod]
     */
    @RequestMapping(value = "/a/u/creditor/creater", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String enterpriseName, String creditor, String phoneNum, String cardId, Long LoanTime, BigDecimal loanAmount,Long loanPeriod) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 进入编辑页面
     * @author YangCongcong 18/7/5 10:29
     * @params []
     */
    @RequestMapping(value = "/a/u/creditors/updater", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getUpdate() {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("enterpriseName", "涌动公司");
        jsonObject1.put("creditor", "赵菊");
        jsonObject1.put("phoneNum", "13388880806");
        jsonObject1.put("cardID", "36242212345678900X");
        jsonObject1.put("loanAmount", "200000.00");
        jsonObject1.put("loanPeriod", "3");
        jsonObject1.put("loanAt", "2018/05/30 0：00：00");
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonObject1);
        return jsonObject;
    }

    /**
     * @Description: 完成编辑
     * @author YangCongcong 18/7/5 10:33
     * @params [enterpriseName, creditor, phoneNum, cardId, LoanTime, loanAmount, loanPeriod]
     */
    @RequestMapping(value = "/a/u/creditor/updater", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject updateToCreditor(String enterpriseName, String creditor, String phoneNum, String cardId, Long LoanTime, BigDecimal loanAmount,Long loanPeriod) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/5 10:34
     * @params [id]
     */
    @RequestMapping(value = "/a/u/creditor/updater/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject deleteToCreditor(@PathVariable("id")Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }

    /**
     * @Description: 进入债权匹配
     * @author YangCongcong 18/7/5 10:35
     * @params []
     */
    @RequestMapping(value = "/a/u/creditor/matcher", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject enterMatch() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("contractId", "1");
        jsonObject1.put("productTerm", "7");
        jsonObject1.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject1.put("investment", "10000.00");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("contractId", "2");
        jsonObject2.put("productTerm", "30");
        jsonObject2.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject2.put("investment", "10000.00");
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("contractId", "3");
        jsonObject3.put("productTerm", "30");
        jsonObject3.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject3.put("investment", "10000.00");
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 所有投资
     * @author YangCongcong 18/7/5 10:43
     * @params []
     */
    @RequestMapping(value = "/a/u/creditor/matcher/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getMatcherList() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("contractId", "1");
        jsonObject1.put("productTerm", "7");
        jsonObject1.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject1.put("investment", "10000.00");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("contractId", "2");
        jsonObject2.put("productTerm", "30");
        jsonObject2.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject2.put("investment", "10000.00");
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("contractId", "3");
        jsonObject3.put("productTerm", "30");
        jsonObject3.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject3.put("investment", "10000.00");
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("contractId", "3");
        jsonObject4.put("productTerm", "30");
        jsonObject4.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject4.put("investment", "10000.00");
        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("contractId", "5");
        jsonObject5.put("productTerm", "30");
        jsonObject5.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject5.put("investment", "10000.00");
        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.put("contractId", "6");
        jsonObject6.put("productTerm", "30");
        jsonObject6.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject6.put("investment", "10000.00");
        JSONObject jsonObject7 = new JSONObject();
        jsonObject7.put("contractId", "7");
        jsonObject7.put("productTerm", "30");
        jsonObject7.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject7.put("investment", "10000.00");
        JSONObject jsonObject8 = new JSONObject();
        jsonObject8.put("contractId", "8");
        jsonObject8.put("productTerm", "30");
        jsonObject8.put("repaymentAt", "2018/08/30 24：00：00");
        jsonObject8.put("investment", "10000.00");
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);
        jsonArray.add(jsonObject6);
        jsonArray.add(jsonObject7);
        jsonArray.add(jsonObject8);
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /**
     * @Description: 匹配完成
     * @author YangCongcong 18/7/5 10:47
     * @params [creditorId, contractId, sruplusMoney]
     */
    @RequestMapping(value = "a/u/admin/creditor/matcher", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject matchCompletion(Long creditorId,List<Long> contractId,BigDecimal sruplusMoney) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
