package com.ptteng.remote;


import com.ptteng.remote.hystric.HomeBankCardRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeBankCardRemoteHystric.class)
public interface HomeBankCardRemote {
}
