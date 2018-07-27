package com.ptteng.remote;

import com.ptteng.remote.hystric.ContractListRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = ContractListRemoteHystric.class)
public interface ContractListRemote {

}