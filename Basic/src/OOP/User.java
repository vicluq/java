package OOP;

public class User {
    // ! Atributos
    public String userName;
    public int age;
    public double balance;
    public double salary;
    public boolean isAdmin;

    // ! Construtores

    // ! Metodos -> [privacidade] [static?] [tipo que retorna] [nome] () {}
    public double getFullSalary() {
        // * This -> keyword que usamos para acessar atributos contidos na classe
        // return this.salary * 1.15; 
        // Funciona sem o this também
        return salary * 1.15; 

        // * Quando temos parametro com o mesmo nome de um atributo, usamos o this para diferenciar
    }

    public void addBalance(double value) {
        balance += value;
    }

    // Sobrescrevendo o toString padrão
    public String toString() {
        return "";
    }
}
