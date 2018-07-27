package com.ptteng.remote;

import com.ptteng.remote.hystric.DealRecordRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "polyfinance-business-service",fallback = DealRecordRemoteHystric.class)
public interface DealRecordRemote {

}