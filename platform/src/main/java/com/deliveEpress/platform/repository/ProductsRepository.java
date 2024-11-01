package com.deliveEpress.platform.repository;

import com.deliveEpress.platform.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    // Additional query methods can be defined here
}
