package com.Maven_project.springboot_first_app;

import com.Maven_project.springboot_first_app.Category;
import com.Maven_project.springboot_first_app.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize some categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category groceries = new Category();
        groceries.setName("Groceries");

        categoryRepository.saveAll(Arrays.asList(electronics, groceries));
    }
}
