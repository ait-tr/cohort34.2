package s.incorrect;

public class Service {

    public boolean checkPassword(String password) {
        return password.length() >= 5;
    }

    public void checkAge(Customer customer) {
        if (customer.getAge() < 12) {
            System.out.println("Возраст слишком мал!");
        }
    }

    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);
    }

    public void generateArticle(Product product) {
        product.setArticle("A-" + product.getName());
    }
}