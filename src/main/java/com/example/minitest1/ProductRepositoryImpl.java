package com.example.minitest1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> getAllProducts() {
        try {
            // Sử dụng ClassPathResource để đọc file từ thư mục resources
            ClassPathResource resource = new ClassPathResource("Book.json");
            InputStream inputStream = resource.getInputStream();

            // Đọc nội dung từ file và chuyển đổi thành List<Product>
            ObjectMapper objectMapper = new ObjectMapper();
            Product[] productsArray = objectMapper.readValue(inputStream, Product[].class);

            return Arrays.asList(productsArray);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Product getProductById(Integer id) {
        try {
            ClassPathResource resource = new ClassPathResource("Book.json");
            InputStream inputStream = resource.getInputStream();

            ObjectMapper objectMapper = new ObjectMapper();
            Product[] productsArray = objectMapper.readValue(inputStream, Product[].class);

            return Arrays.stream(productsArray)
                    .filter(product -> product.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}