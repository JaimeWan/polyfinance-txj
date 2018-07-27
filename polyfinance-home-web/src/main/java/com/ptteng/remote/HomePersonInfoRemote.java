package com.ptteng.remote;

import com.ptteng.remote.hystric.HomePersonInfoRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomePersonInfoRemoteHystric.class)
public interface HomePersonInfoRemote {
}
