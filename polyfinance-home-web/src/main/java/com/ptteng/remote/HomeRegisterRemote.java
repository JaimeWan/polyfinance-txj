package com.ptteng.remote;

import com.ptteng.remote.hystric.HomeRegisterRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeRegisterRemoteHystric.class)
public interface HomeRegisterRemote {
}
