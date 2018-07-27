package com.ptteng.remote;

import com.ptteng.remote.hystric.UserMessageRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = UserMessageRemoteHystric.class)
public interface UserMessageRemote {

}