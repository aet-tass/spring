package com.deliveEpress.platform.service;

import com.deliveEpress.platform.dto.ProductsDTO;

import java.util.List;

public interface ProductsService {
    ProductsDTO createProduct(ProductsDTO productsDTO);
    ProductsDTO updateProduct(ProductsDTO productsDTO);
    void deleteProduct(Integer productId);
    ProductsDTO getProductById(Integer productId);
    List<ProductsDTO> getAllProducts();
}
