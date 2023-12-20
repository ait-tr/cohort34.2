package o.incorrect;

public class ProductService {

    public void generateArticle(Product product, boolean forRetail) {
        if (forRetail) {
            product.setArticle("R-" + product.getName());
        } else {
            product.setArticle("W-" + product.getName());
        }
    }
}