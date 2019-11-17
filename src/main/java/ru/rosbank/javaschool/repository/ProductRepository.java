package ru.rosbank.javaschool.repository;

import ru.rosbank.javaschool.domain.Product;
import ru.rosbank.javaschool.exception.DataSaveException;

import java.util.Collection;
import java.util.LinkedList;

public class ProductRepository implements ProductRep {
    private final Collection<Product> productList =new LinkedList<>();
    private int nextIid=1;

    public ProductRepository() {
    }

    public Collection<Product> getAll() {
        return productList;
    }

    public Product create(Product item) {
        item.setId(nextIid++);
        productList.add(item);
        return item;
    }

    public Product update(Product item) {
        for (Product p:productList) {
            if(item.getId()== p.getId()){
                p.setName(item.getName());
                p.setPrice(item.getPrice());
                return p;
            }
        }

        throw new DataSaveException("Product with id = " + item.getId() + " not found.");
    }

    public Product delete(Product item) {
        Product pr=new Product();
        for (Product p:productList) {
            if(item.getId()== p.getId()){
                pr=p;
            }
        }
        if(pr !=null){
            productList.remove(pr);
            return pr;
        }
        throw new DataSaveException("Product with id = " + item.getId() + " not found.");

    }

    public String read(Product item) {
        for (Product p:productList) {
            if(item.getId()== p.getId()){
                return p.toString();
            }
        }

        throw new DataSaveException("Product with id = " + item.getId() + " not found.");
    }

    public Product search(String name){

        Product product = new Product();
        for(Product p:productList){
            if(p.getName().equals(name)){
                product=p;
            }
        }
        return product;
    }
}
