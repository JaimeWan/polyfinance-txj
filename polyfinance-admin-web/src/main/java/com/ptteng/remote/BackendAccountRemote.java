package com.ptteng.remote;

import com.ptteng.remote.hystric.BackendAccountRemoteHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

//value 通过服务名来指定调用哪个服务
@FeignClient(value = "polyfinance-business-service",fallback = BackendAccountRemoteHystric.class)
public interface BackendAccountRemote {

}