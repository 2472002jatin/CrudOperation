package com.Maven_project.springboot_first_app.repository;

import com.Maven_project.springboot_first_app.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
