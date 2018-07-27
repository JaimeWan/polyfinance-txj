package com.ptteng.remote;

import com.ptteng.remote.hystric.FeedBackRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = FeedBackRemoteHystric.class)
public interface FeedBackRemote {

}