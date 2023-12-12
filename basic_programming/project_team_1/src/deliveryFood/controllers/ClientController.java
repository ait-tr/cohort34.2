package deliveryFood.controllers;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.services.interfaces.ClientService;

import java.util.List;
import java.util.Scanner;

public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    public void addClient() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();

            System.out.println("Input client address:");
            String address = scanner.nextLine();

            service.addClient(name, address);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Client> getAllAvailableClients() {
        return service.getAllAvailableClients();
    }
    public List<Client> getAllClients() {
        return service.getAllClients();
    }
    public List<Order> getAllOrdersByClientById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            return service.getAllOrdersByClientById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientById(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            service.deleteClientById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientByName(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();
            service.deleteClientByName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreClientById(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            service.restoreClientById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreClientByName(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();
            service.restoreClientByName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void changeName(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Input client new name:");
            String name = scanner.nextLine();
            service.changeName(id, name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void changeAddress(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Input client new address:");
            String address = scanner.nextLine();
            service.changeAddress(id, address);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public int totalClientQuantity(){
        return service.totalClientQuantity();
    }

    public int totalOrderQuantity(){
        return service.totalOrderQuantity();
    }

    public int orderQuantityByClient(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());
            return  service.orderQuantityByClient(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
