package shop.domain.interfaces;

public interface Customer {

    int getId();

    boolean isActive();

    String getName();

    Cart getCart();
}