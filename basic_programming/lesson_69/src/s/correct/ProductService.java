package s.correct;

public class ProductService {

    public void generateArticle(Product product) {
        product.setArticle("A-" + product.getName());
    }
}