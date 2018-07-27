package com.ptteng.remote;

import com.ptteng.remote.hystric.CreditorMatchingRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = CreditorMatchingRemoteHystric.class)
public interface CreditorMatchingRemote {

}