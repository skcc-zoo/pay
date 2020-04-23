package com.example.pay.external;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "space", url = "${api.url.space}")
public interface SpaceService {
    @RequestMapping(method = RequestMethod.GET, path = "/permission")
    boolean getPermission();
}
