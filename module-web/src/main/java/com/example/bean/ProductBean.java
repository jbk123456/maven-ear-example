package com.example.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Named("productBean")
@ManagedBean
@SessionScoped
public class ProductBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private List<Product> products;
    private boolean showAll = true;
    
    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Laptop", "Electronics", new BigDecimal("999.99"), 15));
        products.add(new Product(2L, "Mouse", "Electronics", new BigDecimal("29.99"), 50));
        products.add(new Product(3L, "Keyboard", "Electronics", new BigDecimal("79.99"), 0));
        products.add(new Product(4L, "Monitor", "Electronics", new BigDecimal("299.99"), 8));
        products.add(new Product(5L, "Desk Chair", "Furniture", new BigDecimal("199.99"), 12));
        products.add(new Product(6L, "Desk Lamp", "Furniture", new BigDecimal("49.99"), 0));
        products.add(new Product(7L, "USB Cable", "Accessories", new BigDecimal("9.99"), 100));
        products.add(new Product(8L, "Webcam", "Electronics", new BigDecimal("89.99"), 25));
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public List<Product> getFilteredProducts() {
        if (showAll) {
            return products;
        } else {
            return products.stream()
                    .filter(p -> p.getStock() != null && p.getStock() > 0)
                    .collect(Collectors.toList());
        }
    }
    
    public boolean isShowAll() {
        return showAll;
    }
    
    public void setShowAll(boolean showAll) {
        this.showAll = showAll;
    }
    
    public void toggleView() {
        this.showAll = !this.showAll;
    }
}
