package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.model.ProductList;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: polyfinance-txj
 * @description: 理财
 * @author: Yang Congcong
 * @create: 2018-07-05 14:36
 **/
@RestController
public class HomeFinanceController {

    /**
     * @Description: 理财产品列表
     * @author YangCongcong 18/7/5 14:39
     * @params [page, size]
     */
    @RequestMapping(value = "/a/u/home/productlist", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getProductList(Integer page,Integer size) {
        if(page==1){
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
            List<ProductList> data=new ArrayList<>();
            data.add(productList1);
            data.add(productList2);
            data.add(productList3);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 200);
            jsonObject.put("message", "success");
            jsonObject.put("data", data);
            jsonObject.put("total",3);
            return jsonObject;
        }

       else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 4002);
            jsonObject.put("message", "fail");
            jsonObject.put("total",0);
            return jsonObject;
        }
    }

    /**
     * @Description: 富友协议接口
     * @author YangCongcong 18/7/5 14:42
     * @params [name]
     */
    @RequestMapping(value = "/a/u/home/protocol/{name}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject fuyouProtocol(@PathVariable("name")String name) {
        if(StringUtils.isNotEmpty(name)){
            String data="《唐和尚西行记》元大正三年 初版 作者:变化山人\n" +
                    "此书是内容最接近吴承恩版《西游记》的一本，被史学家公认为是《西游记》之父。\n" +
                    "此段内容节选自第七十六章:\n" +
                    "女儿国中迎贵客，\n" +
                    "高僧心头藏佳人。\n" +
                    "说那唐僧师徒到了女儿国，那女儿国国王见着唐僧丰神俊朗，气度非凡，那一缕情丝便牢牢系在唐僧身上。\n" +
                    "几次宴请，几番面谈，愈觉心中割舍不下，索性耍了手段，将唐僧师徒四人软禁在宫内，欲断了众人西天取经之念。\n" +
                    "那女儿国国王是天仙一般的人物，说心里话，唐僧焉有不动心之理，只是西天取经是造福天下的大善事，如何能因自己一己之私放弃？\n" +
                    "唐僧央求孙猴子，道:“你有七十二般变化，何不变化飞鸟鼠子，去将关谍偷来。”\n" +
                    "女儿国国王与师父之间尴尬情事，猴子如何不晓，他恼师父平日啰嗦，这时扮出嘻皮脸儿，笑道:“俗话说，宁拆千座庙，不散一对婚，师父，这伤天害理的事儿，徒儿可做不到。”\n" +
                    "唐僧无奈，又去找猪八戒，道:“八戒，你变作穿山甲去将关谍偷来如何？”\n" +
                    "八戒贪恋女儿国国中佳丽美色，虽不能上，然可解馋，便说:“情结还须心来解，师父，多留些日子，把这事好生了结了！”\n" +
                    "唐僧心下焦躁，又去找沙和尚，道:“悟净……”话没说完，沙和尚抚着大肚道:“师父，我误饮了子母河的水，现下正在养胎，如何能做正事？”\n" +
                    "唐僧大急，心中佛祖端坐，可脑中和下边，已俱是国王倩影，不知自己还能撑几时。\n" +
                    "到了晚上，宫女送来食物，俱是山珍海味，色味皆美，想是要唐僧破戒，弃了那清规戒律。\n" +
                    "其中有一盘煮蛋，壳上花纹极异，看来是传说中的凤凰蛋。\n" +
                    "唐僧如何有吃的心，到了晚间，月上树梢，他依旧撑着脸，不住落泪。\n" +
                    "突然桌上异响，唐僧定睛一看，只见一粒凤凰蛋从盘中滚落下来。\n" +
                    "唐僧正自诧异，那蛋言道:“长老可是前去西天取经的大唐高僧？”\n" +
                    "唐僧道:“正是，只是高僧两字却不敢当。”\n" +
                    "那蛋激动的浑身发抖，整个食案都震动起来。只听它道:“师父，可等死徒儿了！”\n" +
                    "唐僧道:“蛋，何出此言？”\n" +
                    "那蛋一蹦一蹦走上前来，激动的声音也发颤了:“好叫师父得知，我本戊日星君所修炼出的一粒波色子，自有了灵性，一日贪玩，飞出星空，被一只凤凰啄食入腹中，无奈之下，结成一卵。我心灰意冷之际，星君托化元神告诉我，我可结一善缘，则百年之后，能再转生。”\n" +
                    "唐僧道:“莫非这善缘与我有关！”\n" +
                    "那蛋道:“正是，师父，你若认了我这徒儿，明日将我献于国王，则我必有方法让国王不再纠缠于师父。”\n" +
                    "唐僧心中一动，道:“这，这是真话么？”\n" +
                    "那蛋道:“千真万确，只是师父，欲结成此善缘，还请师父赐徒儿一名字，以全师徒之礼。”\n" +
                    "唐僧见这蛋儿，不似有任何本事，生怕受了欺骗，不由一时迟疑。\n" +
                    "那蛋突然发出悲声:“师父，我为助你，定要深入暗无天日之境，水深火热之中，何一名也舍不得？”\n" +
                    "唐僧见这蛋情真意切，确不似作假，心中感动，道:“为师见你一蹦一跳的甚是可爱，便赐汝名为跳蛋吧！”\n";
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 200);
            jsonObject.put("message", "success");
            jsonObject.put("data", data);
            jsonObject.put("total",3);
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
     * @Description: 支付接口
     * @author YangCongcong 18/7/5 14:47
     * @params [userId, amt, bankCard, name, idType, idNo, productId]
     */
    @RequestMapping(value = "/a/u/home/pay", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject usePay(Long userId, BigDecimal amt,String bankCard,String name,String idType,String idNo,Long productId) {
       if(userId!=null&&amt!=null&&bankCard!=null&&name!=null&&idType!=null&&idNo!=null&&productId!=null){
           String payurl="www-1.fuiou.com:18670/mobile_pay/pay/debit_mem2.html?mchntCd=0003050F0363796&name=%25E5%25AD%2599%25E6%2582%259F%25E7%25A9%25BA&bank_no=0801020000&orderid=18070716514100235166&amt=1&sfz=513902199111200036&name_fy=%25E5%25AD%2599%25E6%2582%259F%25E7%25A9%25BA&sfz_fy=513902199111200036&homeurl=http%253A%252F%252Fwww-1.gw.fuiou.com%252Fms%252Fv15%252Fcallback.do&reurl=http%253A%252F%252Fwww-1.gw.fuiou.com%252Fms%252Fv15%252Forder.jsp&ono=6215583202004025768&mobile=13888888888&bank=%25E5%25B7%25A5%25E5%2595%2586%25E9%2593%25B6%25E8%25A1%258C&type=%25E5%2580%259F%25E8%25AE%25B0%25E5%258D%25A1&md5=bfe7a84f6305ee5f12f8f8f320cb84d0";
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("code", 200);
           jsonObject.put("message", "success");
           jsonObject.put("url",payurl);
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
     * @Description: 支付回调接口
     * @author YangCongcong 18/7/5 14:49
     * @params []
     */
    @RequestMapping(value = "/a/u/home/callback", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject paymentCallback() {
        return new JSONObject();
    }
}
