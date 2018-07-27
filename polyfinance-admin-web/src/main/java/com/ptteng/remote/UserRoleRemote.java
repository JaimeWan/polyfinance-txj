package com.ptteng.remote;

import com.ptteng.remote.hystric.UserRoleRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = UserRoleRemoteHystric.class)
public interface UserRoleRemote {

}