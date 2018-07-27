package com.ptteng.remote;

import com.ptteng.remote.hystric.HomeFinanceRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeFinanceRemoteHystric.class)
public interface HomeFinanceRemote {
}
