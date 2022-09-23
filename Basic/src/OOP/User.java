package OOP;

public class User {
    // ! Atributos
    public String userName;
    public int age;
    private double balance;
    private double salary;
    public boolean isAdmin;

    // ! Construtores (podem ter sobrecarga)
    public void User() {}

    public User(String name, int age, double balance, double salary) {
        userName = name;
        this.age = age; // Validar se é negativo
        this.balance = balance;
        this.salary = salary;
        isAdmin = false;
    }

    // ! Metodos -> [privacidade] [static?] [tipo que retorna] [nome] () {}
    public double getFullSalary() {
        // * This -> keyword que usamos para acessar atributos contidos na classe
        // return this.salary * 1.15; 
        // Funciona sem o this também
        // ? Usamos o this pra diferencias entre parametro de metodo e atributo
        return salary * 1.15; 

        // * Quando temos parametro com o mesmo nome de um atributo, usamos o this para diferenciar
    }

    public void addBalance(double value) {
        balance += value;
    }

    public double getBalance() {
        return this.balance;
    }

    // Sobrescrevendo o toString padrão (imprimir o obj)
    public String toString() {
        return "";
    }
}
