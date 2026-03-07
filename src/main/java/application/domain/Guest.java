package aplication.domain;

import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

public class Guest {

    Scanner sc = new Scanner(System.in);

    // guest atributes

    public int idGuest;
    public String name;
    public String lastName;
    public String email;
    public String password;
    public boolean state;
    public String origin;
    public String typeGuest;


    // constructor
    public Guest(){

    }

    public Guest(int idGuest, String name, String lastName, String email, String password, boolean state, String origin, String typeGuest){
        this.idGuest = idGuest;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
        this.origin = origin;
        this.typeGuest = typeGuest;

    }

    // get and setters

    public int getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(int idGuest) {
        this.idGuest = idGuest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }


    // INYECCIÓN DE INDEPENDENCIA

    public Guest createGuest(Guest guest){

        System.out.println("Digite el id del huésped: ");
        int idGuest = sc.nextInt();
        guest.idGuest = idGuest;
        sc.nextLine();

        System.out.println("Digite el nombre: ");
        guest.name = sc.nextLine();

        System.out.println("Digite el apellido: ");
        guest.lastName = sc.nextLine();

        System.out.println("Digite el email: ");
        guest.email = sc.nextLine();

        System.out.println("Digite la contraseña: ");
        guest.password = sc.nextLine();

        System.out.println("Digite el origen: ");
        guest.origin = sc.nextLine();

        System.out.println("Digite el tipo de huésped: ");
        guest.typeGuest = sc.nextLine();

        System.out.println("Digite el estado (true/false): ");
        guest.state = sc.nextBoolean();
        sc.nextLine();


        return guest;
    }

    public  Guest updateGuest(Guest guest){
        return guest;
    }

    public Guest getGuestById(int id, Guest guest){

        if(this.idGuest == id){
            System.out.println("ID: " + guest.idGuest + "\n" +
                    "Nombre: " + guest.name + "\n" +
                    "Apellido: " + guest.lastName + "\n" +
                    "Email: " + guest.email + "\n" +
                    "Origen: " + guest.origin + "\n" +
                    "Tipo huésped: " + guest.typeGuest + "\n" +
                    "Estado: " + guest.state);
        } else {
            System.out.println("Valide el Id del huésped que esta consultando");
        }

        return null;
    }

    public List<Guest> getAllGuest(){
        return null;
    }

    public Guest deleteGuest(Guest guest){
        return guest;
    }

}
