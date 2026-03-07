package aplication.domain;

import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public int idService;
    public String name;
    public boolean status;
    public double price;

    //constructor

    public Service (){

    }

    public Service(int idService, String name, Boolean status, double price){
        this.idService = idService;
        this.name = name;
        this.status = status;
        this.price = price;
    }


    // get and set

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


    // metodos

    public Service createService(Service service){

        System.out.println("Digite el id del servicio: ");
        int idService = sc.nextInt();
        service.idService = idService;
        sc.nextLine();

        System.out.println("Digite el nombre del servicio: ");
        service.name = sc.nextLine();

        System.out.println("Digite el estado (true/false): ");
        service.status = sc.nextBoolean();

        System.out.println("Digite el precio: ");
        service.price = sc.nextDouble();
        sc.nextLine();

        return service;
    }

    public  Service updatesService(Service service){
        return service;
    }

    public Service getServiceById(int id, Service service){

        if(this.idService == id){
            System.out.println("ID: " + service.idService + "\n" +
                    "Nombre servicio: " + service.name + "\n" +
                    "Status: " + service.status + "\n" +
                    "Precio: " + service.price);
        } else {
            System.out.println("Valide el Id del servicio que esta consultando");
        }

        return null;
    }

    public List<Service> getAllServices(){
        return null;
    }

    public Service deleteService(Service service){

        return service;
    }


}
