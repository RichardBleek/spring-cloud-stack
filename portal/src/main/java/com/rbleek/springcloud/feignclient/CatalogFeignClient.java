package com.rbleek.springcloud.feignclient;

import com.rbleek.springcloud.dto.CatalogDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "catalog-api", fallback = CatalogFallbackClient.class)
public interface CatalogFeignClient {
    @RequestMapping("/api/catalog")
    CatalogDTO getItems();
}