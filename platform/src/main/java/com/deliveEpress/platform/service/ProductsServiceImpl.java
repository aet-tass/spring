package com.deliveEpress.platform.service;

import com.deliveEpress.platform.dto.ProductsDTO;
import com.deliveEpress.platform.entity.Products;
import com.deliveEpress.platform.repository.ProductsRepository;
import com.deliveEpress.platform.service.ProductsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductsDTO createProduct(ProductsDTO productsDTO) {
        Products product = modelMapper.map(productsDTO, Products.class);
        product = productsRepository.save(product);
        return modelMapper.map(product, ProductsDTO.class);
    }

    @Override
    public ProductsDTO updateProduct(ProductsDTO productsDTO) {
        Products product = modelMapper.map(productsDTO, Products.class);
        product = productsRepository.save(product);
        return modelMapper.map(product, ProductsDTO.class);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productsRepository.deleteById(productId);
    }

    @Override
    public ProductsDTO getProductById(Integer productId) {
        Products product = productsRepository.findById(productId).orElse(null);
        return modelMapper.map(product, ProductsDTO.class);
    }

    @Override
    public List<ProductsDTO> getAllProducts() {
        return productsRepository.findAll()
                .stream()
                .map(product -> modelMapper.map(product, ProductsDTO.class))
                .collect(Collectors.toList());
    }
}
