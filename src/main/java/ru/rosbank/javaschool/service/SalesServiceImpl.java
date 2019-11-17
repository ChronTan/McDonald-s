package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.domain.Product;
import ru.rosbank.javaschool.exception.DataSaveException;
import ru.rosbank.javaschool.repository.ProductRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SalesServiceImpl {
    private String nameSales;
    private int countSales;
    private int priceSales;

    ProductRepository productRepository = new ProductRepository();

    Map<String, Integer> countS=new HashMap<>();

    public String getNameSales() {
        return nameSales;
    }

    public void setNameSales(String nameSales) {
        this.nameSales = nameSales;
    }

    public int getCountSales() {
        return countSales;
    }

    public void setCountSales(int countSales) {
        this.countSales = countSales;
    }

    public int getPriceSales() {
        return priceSales;
    }

    public void setPriceSales(int priceSales) {
        this.priceSales = priceSales;
    }

    public Map<String, Integer> getCountS() {
        return countS;
    }

    public void setCountS(Map<String, Integer> countS) {
        this.countS = countS;
    }

    public Map sale(String name, int count){
        for (Map.Entry<String, Integer> entry : countS.entrySet()) {
            if(name.equals(entry.getKey())){
                entry.setValue(entry.getValue()+count);
            }
        }
        return countS;
    }

    public String outputProduct(Product product){
        for (Map.Entry<String, Integer> entry : countS.entrySet()) {
            if(product.getName().equals(entry.getKey())){
                if(entry.getKey().equals(product.getName())){
                    return "name: "+ entry.getKey()+",  price: "+ product.getPrice();
                }
            }
        }

        return "No products";
    }



}
