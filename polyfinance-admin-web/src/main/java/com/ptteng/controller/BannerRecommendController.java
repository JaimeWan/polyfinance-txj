package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: polyfinance-txj
 * @description: BannerRecommendController
 * @author: Yang Congcong
 * @create: 2018-07-04 14:45
 **/
@RestController
public class BannerRecommendController {

    /**
     * @Description: banner图列表
     * @author YangCongcong 18/7/4 20:49
     * @params []
     */
    @RequestMapping(value = "/a/u/admin/banners", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getBannerList() {
        return new JSONObject();
    }

    /**
     * @Description: 查询单个banner图
     * @author YangCongcong 18/7/4 21:44
     * @params [pictureId]
     */
    @RequestMapping(value = "/a/u/admin/pictures/{pictureId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getBanner(@PathVariable("pictureId")Long pictureId) {
        return new JSONObject();
    }

    /**
     * @Description: 新增
     * @author YangCongcong 18/7/4 21:38
     * @params [pictureName, url, bannerPictureFile]
     */
    @RequestMapping(value = "/a/u/admin/banner", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String pictureName,String url,String bannerPictureFile) {
        return new JSONObject();
    }

    /**
     * @Description: 删除
     * @author YangCongcong 18/7/4 21:42
     * @params [pictureId]
     */
    @RequestMapping(value = "/a/u/admin/pictures/{pictureId}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public JSONObject clickToDelete(@PathVariable("pictureId")Long pictureId) {
        return new JSONObject();
    }

    /**
     * @Description: 编辑
     * @author YangCongcong 18/7/4 21:47
     * @params [pictureId, pictureName, url, bannerPictureFile]
     */
    @RequestMapping(value = "/a/u/admin/pictures/{pictureId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(@PathVariable("pictureId")Long pictureId,String pictureName,String url,String bannerPictureFile) {
        return new JSONObject();
    }

    /**
     * @Description: 动态查询
     * @author YangCongcong 18/7/4 21:54
     * @params [pictureId, pictureName, createBy, updateBy]
     */
    @RequestMapping(value = "/a/u/admin/pictures/keywords", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject dynamicQuery(Long pictureId,String pictureName,String createBy,String updateBy) {
        return new JSONObject();
    }

    /**
     * @Description: banner图上下架
     * @author YangCongcong 18/7/4 21:58
     * @params []
     */
    @RequestMapping(value = "/a/u/admin/pictureshelf/{pictureId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject upperAndLowerShelves(@PathVariable("pictureId")Long pictureId) {
        return new JSONObject();
    }

    /**
     * @Description: 鼎力推荐图列表
     * @author YangCongcong 18/7/4 22:01
     * @params []
     */
    @RequestMapping(value = "/a/u/admin/recommends", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JSONObject getRecommendList() {
        return new JSONObject();
    }

    /**
     * @Description: 鼎力推荐图新增
     * @author YangCongcong 18/7/4 22:05
     * @params [pictureName, recommendPictureFile]
     */
    @RequestMapping(value = "/a/u/admin/recommend", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONObject clickToAdd(String pictureName,String recommendPictureFile) {
        return new JSONObject();
    }

    /**
     * @Description: 鼎力推荐图编辑
     * @author YangCongcong 18/7/4 22:08
     * @params [pictureId, pictureName, recommendPictureFile]
     */
    @RequestMapping(value = "/a/u/admin/recommends/{pictureId}", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public JSONObject clickToUpdate(@PathVariable("pictureId")Long pictureId,String pictureName,String recommendPictureFile) {
        return new JSONObject();
    }

}
