package com.Maven_project.springboot_first_app.repository;

import com.Maven_project.springboot_first_app.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
