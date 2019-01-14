package com.rbleek.springcloud.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogDTO {

    List<String> catalog = new ArrayList<>();

    public CatalogDTO() {
    }

    public CatalogDTO withDefaults() {
        catalog.add("teal trousers");
        catalog.add("cellphone charger");
        catalog.add("climbing shoes");
        catalog.add("brown backpack");
        return this;
    }

    public List<String> getCatalog() {
        return catalog;
    }
}
