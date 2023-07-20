package br.ufal.ic.p2.shoppingcart;


public class Main {
        public static void main(String[] args) {
            Products p1 = new Products("Feijao", 10.0); //criando produtos
        Products p2 = new Products("acucar", 20.0); //criando produtos

        Customer c1 = new Customer(1, "Mateus", "Casa 1"); //criando cliente

        Shoppingcart s1 = new Shoppingcart(c1); //criando carrinho


        s1.addProduct(p1); //adicionando produtos
        s1.addProduct(p2); //adicionando produtos

        System.out.println("Cliente: " + s1.getCustomerName()); //printando o nome do cliente
        s1.printProducts(); //printando a lista de produtos
        System.out.println("Valor " + s1.gettotalprice());  //printando o valor total
    }

}
