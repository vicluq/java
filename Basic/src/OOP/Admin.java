package OOP;

import OOP.User;

// ! Herança
// * Uma classe que extende outra
// Herda as propriedades e objetos da superclasse
// Pode sobscrever os metodos e propriedades da super tambem

// * Reuso de Codigo, pois não precisa repetir o codigo da superclasse

// * Precisamos chamar o construtor da super para popular os dados que vem dela
// Chamamos super() no construtor da sub -> deve ser a PRIMEIRA coisa q faz no construtor da sub

// * Atributos e metodos privados na super
// são herdados mas não podem ser acessados diretamente na sub (usar getter e setter)

// * Para acessar os atributos e metodos direto em herança, eles devem ser PROTECTED

public class Admin extends User {
    private boolean isModerator;
    private int[] productsId; // Produtod que pertencem ao admin (so o admin pode ter produtos)
    private int prodIndex;

    public Admin(String name, int age, double balance, double salary) {
        super(name, age, balance, salary);
        this.productsId = new int[10];
        prodIndex = 0;
    }

    public void addProduct(int id) {
        if(prodIndex >= productsId.length) {
            int [] newArray = new int [productsId.length + 10];
            // copia tudo
            productsId = newArray;
        }
    }

    public void addModeratorBonus(double bonus) {
        if(this.isModerator) {
            super.addBalance(bonus); // ! Referenciando o metodo da super (util caso tenhamos metodos com mesmo nome)
        }
    }

    public void referenceTest(Admin admin) {
        admin.addBalance(1333);
    }
}
