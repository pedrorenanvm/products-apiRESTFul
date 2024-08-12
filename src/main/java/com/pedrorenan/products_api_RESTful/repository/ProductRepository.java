package com.pedrorenan.products_api_RESTful.repository;


import com.pedrorenan.products_api_RESTful.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
