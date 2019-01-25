package com.rbleek.springcloud.dto;

import java.util.ArrayList;
import java.util.List;

public class CatalogDTO {

    List<String> catalog = new ArrayList<>();

    public CatalogDTO() {
    }

    public CatalogDTO withFallback() {
        catalog.add("fallback trousers");
        catalog.add("fallback charger");
        catalog.add("fallback shoes");
        catalog.add("fallback backpack");
        return this;
    }

    public List<String> getCatalog() {
        return catalog;
    }
}
