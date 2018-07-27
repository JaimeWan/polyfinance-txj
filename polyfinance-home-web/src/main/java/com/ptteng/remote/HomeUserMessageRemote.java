package com.ptteng.remote;

import com.ptteng.remote.hystric.HomeUserMessageRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeUserMessageRemoteHystric.class)
public interface HomeUserMessageRemote {
}
