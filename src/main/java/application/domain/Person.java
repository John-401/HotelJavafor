package aplication.domain;

import java.util.List;
import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);

    // person atributes
    int idPerson;
    String name;
    String lastName;
    String email;
    String password;
    boolean state;

    // constructor
    public Person(){

    }

    public Person(int id, String name, String lastname, String email, String password, boolean state) {
        this.idPerson = id;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.password = password;
        this.state = state;
    }


    // getters and setters
    /* metodo vacio con argumentos, permite pasar información entre carpetas,
     * en este caso es entre aplication main y entre esta, pues en main llame el id,
     * no se me conectaran hasta que yo no ponga estos get y set*/

    public int getId() {
        return idPerson;
    }

    public void setId(int id) {
        this.idPerson = idPerson;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    //class methods

    //inyección de independencia, nos sirve para crear objetos, creamos la persona y creamos un objeto de esa persona

    public Person createUser(Person person) {

        System.out.println("Digite el id de la persona: ");
        person.idPerson = sc.nextInt();

        System.out.println("Digite el nombre: ");
        person.name = sc.nextLine();

        System.out.println("Digite el apellido: ");
        person.lastName = sc.nextLine();

        System.out.println("Digite el email: ");
        person.email = sc.nextLine();

        System.out.println("Digite la contraseña: ");
        person.password = sc.nextLine();

        System.out.println("Digite el estado (true/false): ");
        person.state = sc.nextBoolean();
        sc.nextLine();

        return person;

    }

    public  Person updateUser (Person person){
        return person;

    }

    public List<Person> getUsers(){
        return null;
    }

    public Person getUserById(int idPerson, Person person){

        if(this.idPerson == idPerson){
            System.out.println("ID: " + person.idPerson + "\n" +
                    "Nombre: " + person.name + "\n" +
                    "Apellido: " + person.lastName + "\n" +
                    "Email: " + person.email + "\n" +
                    "Estado: " + person.state);
        } else {
            System.out.println("Valide el Id de la persona que esta consultando");
        }

        return null;
    }

    public Person deletePerson(Person person){
        return person;
    }

}
