package com.example.minitest1;

import java.util.List;
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    // Các phương thức khác cần thiết có thể được thêm vào
}