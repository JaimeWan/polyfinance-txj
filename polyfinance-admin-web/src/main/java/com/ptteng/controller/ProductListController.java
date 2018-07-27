package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.model.ProductList;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

/**
 * @program: polyfinance-txj
 * @description: ProductListController 产品管理
 * @author: Yang Congcong
 * @create: 2018-07-04 14:47
 * @updator:Jaime Wan
 * @update:2018-07-06
 **/

@RestController
public class ProductListController {

    /**
     * @Description: 获取产品列表
     * @author YangCongcong 18/7/5 10:49
     * @params []
     */
    @RequestMapping(value = "/a/u/admin/product/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getProductList() {
        JSONObject jsonObject=new JSONObject();
        List<ProductList> data=new ArrayList<>();
        ProductList productList1=new ProductList();
        ProductList productList2=new ProductList();
        productList1.setId(1L);
        productList1.setProductName("新手礼");
        productList1.setAnnualRate(7L);
        productList1.setProductTerm(7L);
        productList1.setStartAmount(new BigDecimal(5000));
        productList1.setMinAmount(new BigDecimal(1000));
        productList1.setRepaymentMode(0);
        productList1.setState(0);
        productList1.setCreateAt(System.currentTimeMillis());
        productList1.setCreateBy(2222L);
        productList2.setId(2L);
        productList2.setProductName("二手礼");
        productList2.setAnnualRate(13L);
        productList2.setProductTerm(30L);
        productList2.setStartAmount(new BigDecimal(5000));
        productList2.setMinAmount(new BigDecimal(1000));
        productList2.setRepaymentMode(0);
        productList2.setState(0);
        productList2.setCreateAt(System.currentTimeMillis());
        productList2.setCreateBy(1111L);
        data.add(productList1);
        data.add(productList2);
        jsonObject.put("code",200);
        jsonObject.put("message","success");
        jsonObject.put("data",data);
        return jsonObject;
    }

    /**
     * @Description: 动态查询
     * @author YangCongcong 18/7/5 10:52
     * @params [productId, productName, createBy, state]
     */
    @RequestMapping(value = "/a/u/admin/product/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject dynamicQuesry(@RequestParam(value ="productId" ,required = false) Long productId, @RequestParam(value ="productName" ,required = false) String productName,@RequestParam(value = "createBy",required = false) String createBy,@RequestParam(value ="state" ,required = false) Integer state) {

        JSONObject jsonObject=new JSONObject();
        List<ProductList> data=new ArrayList<>();
        ProductList productList1=new ProductList();
        ProductList productList2=new ProductList();
        ProductList productList3=new ProductList();
        productList1.setId(1L);
        productList1.setProductName("新手礼");
        productList1.setAnnualRate(7L);
        productList1.setProductTerm(7L);
        productList1.setStartAmount(new BigDecimal(5000));
        productList1.setMinAmount(new BigDecimal(1000));
        productList1.setRepaymentMode(0);
        productList1.setState(0);
        productList1.setCreateAt(System.currentTimeMillis());
        productList1.setCreateBy(2222L);
        productList2.setId(2L);
        productList2.setProductName("二手礼");
        productList2.setAnnualRate(13L);
        productList2.setProductTerm(30L);
        productList2.setStartAmount(new BigDecimal(5000));
        productList2.setMinAmount(new BigDecimal(1000));
        productList2.setRepaymentMode(0);
        productList2.setState(1);
        productList2.setCreateAt(System.currentTimeMillis());
        productList2.setCreateBy(1111L);
        productList3.setId(3L);
        productList3.setProductName("三手礼");
        productList3.setAnnualRate(13L);
        productList3.setProductTerm(30L);
        productList3.setStartAmount(new BigDecimal(5000));
        productList3.setMinAmount(new BigDecimal(1000));
        productList3.setRepaymentMode(0);
        productList3.setState(1);
        productList3.setCreateAt(System.currentTimeMillis());
        productList3.setCreateBy(1111L);
        if(state!=null){
            if(state==1){
                data.add(productList2);
                data.add(productList3);
                jsonObject.put("code",200);
                jsonObject.put("message","success");
                jsonObject.put("data",data);
                return jsonObject;
            }
            if(state==0){
                data.add(productList1);
                jsonObject.put("code",200);
                jsonObject.put("message","success");
                jsonObject.put("data",data);
                return jsonObject;
            }
        }if(createBy!=null||productId!=null||productName!=null){

            if(createBy!=null&&Long.valueOf(createBy)==1111){
                data.add(productList2);
                data.add(productList3);
                jsonObject.put("code",200);
                jsonObject.put("message","success");
                jsonObject.put("data",data);
                return jsonObject;
            }
            if("新手礼".equals(productName)||productId==1||Long.valueOf(createBy)==2222){
                data.add(productList1);
                jsonObject.put("code",200);
                jsonObject.put("message","success");
                jsonObject.put("data",data);
                return jsonObject;
            }
            if("二手礼".equals(productName)||productId==2){
                data.add(productList2);
                jsonObject.put("code",200);
                jsonObject.put("message","success");
                jsonObject.put("data",data);
                return jsonObject;
            }
            else {
                jsonObject.put("code",300);
                jsonObject.put("message","no data");
                return jsonObject;
            }
        }
        else {
            jsonObject.put("code",300);
            jsonObject.put("message","no data");
            return jsonObject;
        }

    }

    /**
     * @Description: 新增  （投资周期和年利率的类型）
     * @author YangCongcong 18/7/5 11:15
     * @params [productName, annualRate, productorTerm, startMoney, minMoney, repaymentMode, introduction, more]
     */
    @RequestMapping(value = "/a/u/admin/product/creater", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String productName, Long annualRate, Long productorTerm, BigDecimal startMoney, BigDecimal minMoney, Integer repaymentMode, String introduction, String more) {
        JSONObject jsonObject = new JSONObject();
        if(productName.equals(null)&&annualRate==null&&productorTerm==null&&startMoney==null&&minMoney==null&&repaymentMode==null&&introduction==null&&more==null){
            jsonObject.put("code",4002);
            jsonObject.put("message","fail");
            return jsonObject;
        }
        else {
            jsonObject.put("code",200);
            jsonObject.put("message","success");
            return jsonObject;
        }
    }

    /**
     * @Description: 进入编辑
     * @author YangCongcong 18/7/5 11:17
     * @params []
     */
    @RequestMapping(value = "/a/u/admin/product/updateby", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject enterUpdate(Long productId,Long userId) {
        JSONObject jsonObject = new JSONObject();
        if(productId!=null&&userId!=null){
            ProductList productList1=new ProductList();
            productList1.setProductName("新手礼");
            productList1.setAnnualRate(7L);
            productList1.setProductTerm(7L);
            productList1.setStartAmount(new BigDecimal(5000));
            productList1.setMinAmount(new BigDecimal(1000));
            productList1.setRepaymentMode(0);
            productList1.setIntroduction("买了就亏");
            productList1.setMore("不买更亏");
            List<ProductList> data=new ArrayList<>();
            data.add(productList1);
            jsonObject.put("code",200);
            jsonObject.put("message","success");
            jsonObject.put("data",data);
            return jsonObject;
        }
        else {
            jsonObject.put("code",200);
            jsonObject.put("message","fail");
            return jsonObject;
        }
    }

    /**
     * @Description: 完成编辑
     * @author YangCongcong 18/7/5 11:18
     * @params [productId,productName, annualRate, productorTerm, startMoney, minMoney, repaymentMode, introduction, more]
     */
    @RequestMapping(value = "/a/u/admin/product/updater", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject updateToProduct(Long productId,String productName, Long annualRate, Long productorTerm, BigDecimal startMoney, BigDecimal minMoney, Integer repaymentMode, String introduction, String more) {
        if(productId!=null&&productName.equals(null)&&annualRate==null&&productorTerm==null&&startMoney==null&&minMoney==null&&repaymentMode==null&&introduction==null&&more==null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",200);
            jsonObject.put("message","success");
            return jsonObject;
        }
        else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",4002);
            jsonObject.put("message","fail");
            return jsonObject;
        }
    }

    /**
     * @Description: 上下架
     * @author YangCongcong 18/7/5 11:21
     * @params [productId]
     */
    @RequestMapping(value = "/a/u/admin/product/state", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject upperAndLowerShelves(Long productId) {
        if(productId!=null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",200);
            jsonObject.put("message","success");
            return jsonObject;
        }
        else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",4002);
            jsonObject.put("message","fail");
            return jsonObject;
        }
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/5 11:22
     * @params [id]
     */
    @RequestMapping(value = "/a/u/admin/product/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject deleteToProduct(@PathVariable("id")Long id) {
        if(id!=null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",200);
            jsonObject.put("message","success");
            return jsonObject;
        }
        else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",4002);
            jsonObject.put("message","fail");
            return jsonObject;
        }
    }
}
