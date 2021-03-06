package net.guatejug.restclient.main;

import net.guatejug.restclient.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableFeignClients(basePackages = "net.guatejug.restclient.client")
@EnableAutoConfiguration
public class MainController {

    RestClient restClient;

    public MainController(@Autowired RestClient restClient) {
        this.restClient = restClient;
    }

    @RequestMapping("/")
    @ResponseBody
    public String escribirCosa() {
        return restClient.getCosa();
    }

}
