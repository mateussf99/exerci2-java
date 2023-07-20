package br.ufal.ic.p2.shoppingcart;

public class Customer {
    private int id; //id do cliente
    private String name; //nome do cliente
    private String address; //endereço do cliente

    public Customer(int id, String name, String address) {
        this.id = id; //atribuindo o id do cliente
        this.name = name; //atribuindo o nome do cliente
        this.address = address; //atribuindo o endereço do cliente
        System.out.println("Cliente criado!");
    }

    public int getId() {
        return id; //retornando o id do cliente
    }

    public String getName() {
        return name; //retornando o nome do cliente
    }

    public String getAddress(){
        return address; //retornando o endereço do cliente
    }
}

