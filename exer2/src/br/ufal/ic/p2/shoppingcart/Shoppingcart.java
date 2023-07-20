package br.ufal.ic.p2.shoppingcart;

import java.util.ArrayList;

public class Shoppingcart {
    private Customer customer; //cliente
    private ArrayList<Products> products; //lista de produtos

    public Shoppingcart(Customer customer) {
        this.customer = customer; //atribuindo o cliente
        this.products = new ArrayList<Products>(); //criando a lista de produtos
        System.out.println("Shopping cart criado!");
    }

    public void addProduct(Products product) {
        this.products.add(product); //adicionando o produto na lista
        System.out.println("Produto adicionado!");
    }
    public int getCustomerId() { 
        return this.customer.getId(); //retornando o id do cliente
    }
    public String getCustomerName() {
        return this.customer.getName(); //retornando o nome do cliente
    }
    public String getCustomerAddress() {
        return this.customer.getAddress(); //retornando o endereço do cliente
    }
    
    public void printProducts() {
        for (Products product : this.products) {   //percorrendo a lista de produtos
            System.out.println(product.getName()); //printando o nome do produto
        }
    }
    public double gettotalprice() {
        double total = 0;
        for (Products product : this.products) { //percorrendo a lista de produtos
            total += product.getPrice(); //somando o preço dos produtos
        }
        return total; //retornando o valor total
    }
}
