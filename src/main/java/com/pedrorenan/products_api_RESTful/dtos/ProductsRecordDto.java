package com.pedrorenan.products_api_RESTful.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductsRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
}
