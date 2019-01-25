package com.rbleek.springcloud.feignclient;

import com.rbleek.springcloud.dto.CatalogDTO;
import org.springframework.stereotype.Component;

@Component
public class CatalogFallbackClient implements CatalogFeignClient {

    @Override
    public CatalogDTO getItems() {
        return new CatalogDTO().withFallback();
    }

}
