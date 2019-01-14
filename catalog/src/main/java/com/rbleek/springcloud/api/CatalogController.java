package com.rbleek.springcloud.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import com.rbleek.springcloud.model.CatalogDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Validated
@RequestMapping(path = "/api/catalog", produces = APPLICATION_JSON_UTF8_VALUE)
public class CatalogController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogController.class);

    @RequestMapping(method = RequestMethod.GET)
    public CatalogDTO getCatalog() {
        LOGGER.info("Received get Catalog request.");
        return new CatalogDTO().withDefaults();
    }
}
