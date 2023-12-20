package d.correct;

public class Product {

    private String name;
    private String article;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                '}';
    }
}