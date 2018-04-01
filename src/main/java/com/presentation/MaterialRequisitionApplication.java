package com.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Material requisition demo for presentation. Spring boot + Swagger + Java 8 + Postgres.
 * <p>
 * This is a very simple application to manage internal material. It provides
 * <p>
 * a list of who is using which material.
 * a list of available material.
 * a material requisition form.
 * a material devolution form.
 * The user can request: a book, a laptop, a monitor, a video projector, etc.
 */
@EnableSwagger2
@SpringBootApplication
public class MaterialRequisitionApplication {

    public static void main(final String[] args) {
        SpringApplication.run(MaterialRequisitionApplication.class, args);
    }
}
