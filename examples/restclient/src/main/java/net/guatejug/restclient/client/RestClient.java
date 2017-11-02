package net.guatejug.restclient.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("http://localhost:8081")
public interface RestClient {

    @RequestMapping(path = "some/thing", method = RequestMethod.GET)
    public String getThing();

}
