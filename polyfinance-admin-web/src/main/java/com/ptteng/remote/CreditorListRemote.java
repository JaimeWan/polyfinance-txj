package com.ptteng.remote;

import com.ptteng.remote.hystric.CreditorListRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = CreditorListRemoteHystric.class)
public interface CreditorListRemote {

}