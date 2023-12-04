package shop.services;

import shop.domain.interfaces.Product;
import shop.services.interfaces.ProductService;

import java.util.List;

public class CommonProductService implements ProductService {

    @Override
    public void addProduct(String name, double price) {

    }

    @Override
    public List<Product> getAllActiveProducts() {
        return null;
    }
}