/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
/**
 *
 * @author sakura
 */
public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse(){
        productPrices = new HashMap<>();
        productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        productPrices.put(product, price);
        productStocks.put(product, stock);

    }

    public int price(String product){
        return productPrices.getOrDefault(product,-99);
    }

    public int stock(String product){
        return productStocks.getOrDefault(product,0);
    }

    public boolean take(String product) {
        int currentStock = productStocks.getOrDefault(product, 0);
        if(currentStock>0){
            productStocks.put(product, currentStock - 1);
            return true;
        }

        return false;
    }

    public Set<String> products(){
        return productStocks.keySet();

    }

}
