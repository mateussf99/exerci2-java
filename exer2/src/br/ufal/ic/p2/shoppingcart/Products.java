package br.ufal.ic.p2.shoppingcart;

public class Products {
    private String name; //nome do produto
    private double price; //preço do produto

    public Products(String name, double price) {
        this.name = name; //atribuindo o nome do produto
        this.price = price; //atribuindo o preço do produto
        System.out.println("Product criado!");
    }
    public String getName() {
        return name; //retornando o nome do produto
    }
    public double getPrice() {
        return price; //retornando o preço do produto
    }
}

