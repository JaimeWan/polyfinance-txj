package com.ptteng.remote;

import com.ptteng.remote.hystric.BackendRoleRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = BackendRoleRemoteHystric.class)
public interface BackendRoleRemote {

}