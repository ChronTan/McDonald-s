package ru.rosbank.javaschool.repository;

import ru.rosbank.javaschool.domain.Product;

import java.util.Collection;
public interface ProductRep {

    Collection<Product> getAll();

    Product create(Product item);

    Product update(Product item);
    Product delete(Product item);
    String read(Product item);
}
