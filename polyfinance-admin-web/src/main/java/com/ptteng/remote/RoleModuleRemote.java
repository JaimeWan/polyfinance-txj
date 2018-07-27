package com.ptteng.remote;

import com.ptteng.remote.hystric.RoleModuleRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = RoleModuleRemoteHystric.class)
public interface RoleModuleRemote {

}