package test.java.app.services;

import app.domain.Product;
import app.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private ProductService service;

    @Mock
    private MerchService merchService;

    @BeforeEach
    public void init() {
        ProductRepository repository = new ProductRepository();
        service = new ProductService(repository);

        repository.save(new Product("Banana", 120, "Best bananas"));
        repository.save(new Product("Apple", 90, "Best apples"));
        repository.save(new Product("Orange", 190, "Best oranges"));

        merchService = Mockito.mock(MerchService.class);
        service.setMerchService(merchService);
    }

    @Test
    public void checkIfSupplierInfoWasDeleted() {
        Mockito.when(merchService.withoutSupplierInfo()).thenReturn(true);
        List<Product> products = service.getAll();

        for (Product product : products) {
            assertNull(product.getSupplier());
        }
    }
}