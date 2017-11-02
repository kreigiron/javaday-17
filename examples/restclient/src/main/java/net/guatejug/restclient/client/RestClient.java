package net.guatejug.restclient.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "rest-client", url = "http://localhost:56789")
public interface RestClient {

    @RequestMapping(path = "bar/foo", method = RequestMethod.GET)
    public String getFoo();

}
