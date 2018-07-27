package com.ptteng.remote;

import com.ptteng.remote.hystric.HomeMyFinanceRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = HomeMyFinanceRemoteHystric.class)
public interface HomeMyFinanceRemote {
}
