package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.domain.Product;

import java.util.Map;

public interface SalesService {
    public Map sale(String name, int count);

    public String outputProduct(Product product);
}
