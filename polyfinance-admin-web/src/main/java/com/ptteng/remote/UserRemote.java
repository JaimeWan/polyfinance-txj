package com.ptteng.remote;

import com.ptteng.remote.hystric.UserRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = UserRemoteHystric.class)
public interface UserRemote {

}