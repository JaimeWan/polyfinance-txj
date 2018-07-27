package com.ptteng.remote;

import com.ptteng.remote.hystric.BannerRecommendRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = BannerRecommendRemoteHystric.class)
public interface BannerRecommendRemote {

}