package models;

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProductByID(int id) {
        for (Product product : products) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
