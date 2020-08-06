package Task_09_Product.Models;
import java.time.LocalDate;
import java.util.Date;

public class Product {

    int id;
    String name;
    String UPC;
    String manufacturer;
    int price;
    LocalDate storagePeriod;
    int quantity;

    public Product(int id, String name, String UPC, String manufacturer, int price, LocalDate storagePeriod, int quantity) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(LocalDate storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC='" + UPC + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", storagePeriod=" + storagePeriod +
                ", quantity=" + quantity +
                '}';
    }
}
