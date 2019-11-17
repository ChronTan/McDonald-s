package ru.rosbank.javaschool;

import ru.rosbank.javaschool.domain.Burgers;
import ru.rosbank.javaschool.domain.Potatoes;
import ru.rosbank.javaschool.domain.Product;
import ru.rosbank.javaschool.repository.ProductRepository;
import ru.rosbank.javaschool.service.SalesServiceImpl;

public class Main {
        public static void main(String[] args) {
            ProductRepository productRepository = new ProductRepository();
            productRepository.create(new Product(1,"Burgers",100));
            productRepository.create(new Product(2,"Drinks",70));
            productRepository.create(new Product(3,"Potatoes",50));
            System.out.println(productRepository.getAll());
            SalesServiceImpl salesService = new SalesServiceImpl();
            salesService.getCountS().put("Burgers",0);
            salesService.getCountS().put("Drinks",0);
            salesService.getCountS().put("Potatoes",0);
            System.out.println(salesService.getCountS());
//            salesService.sale("Burgers",5);
//            System.out.println(salesService.getCountS());
//            salesService.sale("Burgers",5);
//            System.out.println(salesService.getCountS());
            System.out.println(salesService.outputProduct(new Product(1,"Burgers",100)));
            Product product=new Product();
            product=productRepository.search("Drinks");
            System.out.println("Finded: "+ product.getName()+" "+ product.getPrice());


        }
}
