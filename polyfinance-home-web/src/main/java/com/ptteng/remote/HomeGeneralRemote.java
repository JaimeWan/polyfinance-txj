package com.ptteng.remote;

import com.ptteng.remote.hystric.HomeGeneralRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeGeneralRemoteHystric.class)
public interface HomeGeneralRemote {
}
