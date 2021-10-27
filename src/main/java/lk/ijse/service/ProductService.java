package lk.ijse.service;

import lk.ijse.dto.ProductDTO;

import java.util.ArrayList;

public interface ProductService {
    void addCustomer(ProductDTO dto);

    void deleteProduct(String id);

    ProductDTO searchProduct(String id);

    ArrayList<ProductDTO> getAllProduct();

    void updateProduct(ProductDTO dto);
}
