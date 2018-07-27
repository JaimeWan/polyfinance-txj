package com.ptteng.remote;

import com.ptteng.remote.hystric.CardsListRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = CardsListRemoteHystric.class)
public interface CardsListRemote {

}