package com.ptteng.remote;

import com.ptteng.remote.hystric.ProductListRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = ProductListRemoteHystric.class)
public interface ProductListRemote {

}