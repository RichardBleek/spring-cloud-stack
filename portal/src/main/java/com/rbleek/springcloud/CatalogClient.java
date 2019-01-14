package com.rbleek.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "catalog-api", fallback = CatalogClientFallback.class)
public interface CatalogClient {
    @RequestMapping("/api/catalog")
    CatalogDTO getItems();
}