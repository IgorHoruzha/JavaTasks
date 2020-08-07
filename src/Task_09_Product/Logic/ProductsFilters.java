package Task_09_Product.Logic;

import Task_01_Student.Models.Student;
import Task_09_Product.Models.Product;

import java.time.LocalDate;

public class ProductsFilters {
    public Product[] byName(Product[] products, String name){

        Product[] resultProduct= new Product[0];

        for (int i=0;i<products.length;i++){
            Product currentProduct=products[i];

            if (currentProduct.getName().equals(name)){

                Product[] tmpArr= new Product[resultProduct.length+1];
                for (int j=0;j<resultProduct.length;j++){
                    tmpArr[j]=resultProduct[j];
                }
                tmpArr[tmpArr.length-1]=currentProduct;
                resultProduct=tmpArr;
            }
        }
        return resultProduct;
    }

    public Product[] byNameAndMaxPrice(Product[] products, String name,int maxPrice){

        Product[] resultProduct= new Product[0];

        for (int i=0;i<products.length;i++){
            Product currentProduct=products[i];

            if (currentProduct.getName().equals(name)&&currentProduct.getPrice()<maxPrice){

                Product[] tmpArr= new Product[resultProduct.length+1];
                for (int j=0;j<resultProduct.length;j++){
                    tmpArr[j]=resultProduct[j];
                }
                tmpArr[tmpArr.length-1]=currentProduct;
                resultProduct=tmpArr;
            }
        }
        return resultProduct;
    }

    public Product[] byStoragePeriod(Product[] products, LocalDate minStoragePeriod){

        Product[] resultProduct= new Product[0];

        for (int i=0;i<products.length;i++){
            Product currentProduct=products[i];

            if (currentProduct.getStoragePeriod().isAfter(minStoragePeriod)){

                Product[] tmpArr= new Product[resultProduct.length+1];
                for (int j=0;j<resultProduct.length;j++){
                    tmpArr[j]=resultProduct[j];
                }
                tmpArr[tmpArr.length-1]=currentProduct;
                resultProduct=tmpArr;
            }
        }
        return resultProduct;
    }
}
