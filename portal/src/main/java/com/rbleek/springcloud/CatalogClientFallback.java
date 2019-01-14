package com.rbleek.springcloud;

import org.springframework.stereotype.Component;

@Component
public class CatalogClientFallback implements CatalogClient {

    @Override
    public CatalogDTO getItems() {
        return new CatalogDTO().withFallback();
    }

}
