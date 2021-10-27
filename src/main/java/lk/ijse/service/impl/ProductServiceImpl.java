package lk.ijse.service.impl;

import lk.ijse.dto.CatagoryDTO;
import lk.ijse.dto.ProductDTO;
import lk.ijse.entity.Catagory;
import lk.ijse.entity.Product;
import lk.ijse.repo.ProductRepo;
import lk.ijse.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void addCustomer(ProductDTO dto) {
        if (productRepo.existsById(dto.getProductID())) {
            //throw new ValidateException("Customer Already Exist");
        }
        productRepo.save(modelMapper.map(dto, Product.class));

    }

    @Override
    public void deleteProduct(String id) {
        if (!productRepo.existsById(id)) {
            //throw new ValidateException("No Customer for Delete..!");
        }
        productRepo.deleteById(id);

    }

    @Override
    public ProductDTO searchProduct(String id) {
        Optional<Product> product = productRepo.findById(id);
        if (product.isPresent()) {
            return modelMapper.map(product.get(), ProductDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<ProductDTO> getAllProduct() {

        List<Product> all = productRepo.findAll();
        return modelMapper.map(all, new TypeToken<ArrayList<ProductDTO>>() {
        }.getType());
    }

    @Override
    public void updateProduct(ProductDTO dto) {
        if (productRepo.existsById(dto.getProductID())) {
            productRepo.save(modelMapper.map(dto, Product.class));


        }

    }
}
