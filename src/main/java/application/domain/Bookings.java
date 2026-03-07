package aplication.domain;

import java.util.List;
import java.util.Scanner;

public class Booking {

    Scanner sc = new Scanner(System.in);

    public int idBooking;
    public String fecha;
    public int cantidad;
    public String guest;
    public String servicio;
    public boolean status;

    // constructor

    public Booking() {

    }

    public Booking(int idBooking, String fecha, int cantidad, String guest, String servicio, boolean status) {
        this.idBooking = idBooking;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.guest = guest;
        this.servicio = servicio;
        this.status = status;

    }


    // get and set

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    // independencia

    public Booking createBooking(Booking booking){

        System.out.println("Digite el id de la reserva: ");
        booking.idBooking = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite la fecha: ");
        booking.fecha = sc.nextLine();

        System.out.println("Digite la cantidad: ");
        booking.cantidad = sc.nextInt();

        System.out.println("Digite el estado (true/false): ");
        booking.status = sc.nextBoolean();
        sc.nextLine();

        return booking;
    }

    public  Booking updateBooking(Booking booking){

        return booking;
    }

    public Booking getBookingById(int id, Booking booking){

        if(this.idBooking == id){
            System.out.println("ID: " + booking.idBooking + "\n" +
                    "Fecha: " + booking.fecha + "\n" +
                    "Cantidad: " + booking.cantidad + "\n" +
                    "Estado: " + booking.status);
        } else {
            System.out.println("Valide el Id de la reserva que esta consultando");
        }

        return null;
    }

    public List<Booking> getAllBooking(){

        return null;
    }

    public Booking deleteBooking(Booking booking){

        return booking;
    }


}
