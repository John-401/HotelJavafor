package aplication.domain;

import java.util.List;
import java.util.Scanner;

public class BedRoom {

    Scanner sc = new Scanner(System.in);

    public int id;
    public int idService;
    public String name;
    public boolean status;
    public double price;

    //constructor

    public BedRoom(){

    }

    public BedRoom(int id, int idService, String name, Boolean status, double price){
        this.id = id;
        this.idService = idService;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    // getter and setters

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // inyección de independencia

    public BedRoom createBedRoom( BedRoom bedRoom){

        System.out.println("Digite el id de la habitación: ");
        int id = sc.nextInt();
        bedRoom.id = id;
        sc.nextLine();

        System.out.println("Digite el estado (true/false): ");
        bedRoom.status = sc.nextBoolean();

        System.out.println("Digite el precio: ");
        bedRoom.price = sc.nextDouble();
        sc.nextLine();

        return bedRoom;
    }

    public BedRoom updateBedRoom(BedRoom bedroom){
        return bedroom;
    }
    public BedRoom getBedRoomById(int id, BedRoom bedRoom){

        if(this.id == id){
            System.out.println("ID: " + bedRoom.id + "\n" +
                    "tipo de servicio: " + bedRoom.idService + "\n" +
                    "nombre habitación: " + bedRoom.name + "\n" +
                    "Status: " + bedRoom.status + "\n" +
                    "Precio: " + bedRoom.price);
        } else {
            System.out.println("Valide el Id de la habitación que esta consultando" );
        }

        return null;
    }

    public BedRoom getAllBedRoom(){
        return null;
    }

    public BedRoom deleteBedRoom(BedRoom bedroom){
        return bedroom;
    }


}
