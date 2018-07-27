package com.ptteng.remote;

import com.ptteng.remote.hystric.ModuleListRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = ModuleListRemoteHystric.class)
public interface ModuleListRemote {

}