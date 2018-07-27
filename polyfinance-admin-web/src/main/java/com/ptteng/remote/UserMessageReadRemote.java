package com.ptteng.remote;

import com.ptteng.remote.hystric.UserMessageReadRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = UserMessageReadRemoteHystric.class)
public interface UserMessageReadRemote {

}