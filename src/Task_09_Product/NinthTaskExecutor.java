package Task_09_Product;

import Library.ArrayTools;
import Task_09_Product.Logic.ProductsFilters;
import Task_09_Product.Models.Product;

import java.time.LocalDate;

public class NinthTaskExecutor {
    public static void start() {
        System.out.println("Task 9:");

        Product[] products = new Product[]{
                new Product(1, "Name1", "UPC1", "Manufacturer1", 101, LocalDate.of(1, 1, 1), 1),
                new Product(2, "Name1", "UPC2", "Manufacturer2", 102, LocalDate.of(2, 2, 2), 2),
                new Product(3, "Name3", "UPC3", "Manufacturer3", 103, LocalDate.of(3, 3, 3), 3),
                new Product(4, "Name4", "UPC4", "Manufacturer4", 104, LocalDate.of(4, 4, 4), 4)
        };

        ProductsFilters productsFilters = new ProductsFilters();

        System.out.println("a:");
        Product[] byName = productsFilters.byName(products, "Name1");
        ArrayTools.display(byName);

        System.out.println("b:");
        Product[] byNameAndPrice = productsFilters.byNameAndMaxPrice(products, "Name1", 102);
        ArrayTools.display(byNameAndPrice);

        System.out.println("c:");
        Product[] byExpiredDate = productsFilters.byStoragePeriod(products, LocalDate.of(2, 1, 1));
        ArrayTools.display(byExpiredDate);

        System.out.println("==================");
    }
}
