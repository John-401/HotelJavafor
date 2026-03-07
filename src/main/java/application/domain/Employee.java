package aplication.domain;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    // Employee atributes
    public int idEmployee;
    public String name;
    public String lastName;
    public String email;
    public String password;
    public boolean state;
    public String role;
    public double salary;

    // constructor
    public Employee(){

    }

    public Employee(int idEmployee, String name, String lastName, String email, String password, Boolean state, String role, double salary){
        this.idEmployee = idEmployee;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
        this.role = role;
        this.salary = salary;

    }


    // getter and setters

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // inyección de independencia:

    public Employee createEmployee(Employee employee){

        System.out.println("Digite el id del empleado: ");
        int idEmployee = sc.nextInt();
        employee.idEmployee = idEmployee;
        sc.nextLine();

        System.out.println("Digite el nombre del empleado: ");
        String name = sc.nextLine();
        employee.name = name;

        System.out.println("Digite el apellido del empleado: ");
        String lastName = sc.nextLine();
        employee.lastName = lastName;

        System.out.println("Digite el email del empleado: ");
        String email = sc.nextLine();
        employee.email = email;

        System.out.println("Digite la contraseña: ");
        String password = sc.nextLine();
        employee.password = password;

        System.out.println("Digite el rol del empleado: ");
        String role = sc.nextLine();
        employee.role = role;

        System.out.println("Digite el salario: ");
        double salary = sc.nextDouble();
        employee.salary = salary;

        System.out.println("Digite el estado (true/false): ");
        boolean state = sc.nextBoolean();
        employee.state = state;
        sc.nextLine();

        return employee;
    }

    public Employee updateEmployee (Employee employee){
        return employee;

    }

    public Employee deleteEmployee (Employee employee){
        return employee;
    }
    public List<Employee> getAllEmployees(){
        return null;
    }

    public Employee getEmployeeById(int id, Employee employee){

        if(this.idEmployee == id){
            System.out.println("ID: " + employee.idEmployee + "\n" +
                    "Nombre: " + employee.name + "\n" +
                    "Apellido: " + employee.lastName + "\n" +
                    "Email: " + employee.email + "\n" +
                    "Rol: " + employee.role + "\n" +
                    "Salario: " + employee.salary + "\n" +
                    "Estado: " + employee.state);
        } else {
            System.out.println("Valide el Id del empleado que esta consultando");
        }

        return null;
    }


}
