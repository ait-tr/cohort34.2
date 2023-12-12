package restaraunt.controllers;

import restaraunt.domain.interfaces.Client;
import restaraunt.repositories.CommonDishRepository;
import restaraunt.services.interfaces.ClientService;

import java.util.List;
import java.util.Scanner;

public class ClientController {

    private ClientService clientService;
    private CommonDishRepository dishRepository;


    public ClientController(ClientService service) {
        this.clientService = service;
        this.dishRepository = new CommonDishRepository();

    }

    public void addClient() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write client lastname:");
            String lastname = scanner.nextLine();

            clientService.addClient(lastname);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    public void removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Client ID to remove:");
        int idToRemove = scanner.nextInt();
        clientService.removeClient(idToRemove);
    }

    public void getClientByLastname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type client lastname:");
        String findByLastname = scanner.nextLine();

        List<Client> clients = clientService.getClientsByLastName(findByLastname);

        if (clients.isEmpty()) {
            System.out.println("Client with lastname " + findByLastname + " doesn't exist");
        } else {
            System.out.println("Client with lastname " + findByLastname + ":");
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }

    public void addDishToClientOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Client ID to add a dish to their order:");
        int clientId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter dish name:");
        String dishName = scanner.nextLine();

        clientService.addDishToOrder(dishName, clientId);

        System.out.println("Dish added to the order for Client ID: " + clientId);
    }

}

