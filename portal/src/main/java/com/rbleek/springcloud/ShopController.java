package com.rbleek.springcloud;

import com.rbleek.springcloud.feignclient.CatalogFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/shop")
public class ShopController {

    private Logger logger = LoggerFactory.getLogger(ShopController.class);

    private final CatalogFeignClient catalogClient;

    @Autowired
    public ShopController(CatalogFeignClient catalogClient) {
        this.catalogClient = catalogClient;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        logger.info("feign client called");
        StringBuilder result = new StringBuilder();
        for (String s : catalogClient.getItems().getCatalog()) {
            result.append(" - ").append(s).append(" <br />");
        }
        return result.toString();
    }
}
