package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Client;
import com.parkauto.rest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/clients")
    public Client Client(@Validated @RequestBody(required = false) Client client) {
        return clientService.saveClient(client);
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{idClient}")
    public ResponseEntity<?> findClientById(@PathVariable(name = "idClient") Long idClient) {
        if(idClient == null) {
            return ResponseEntity.badRequest().body("Cannot find client with null id");
        }
        Client client = clientService.getClientById(idClient);
        if(client == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/clients/{idClient}")
    public ResponseEntity<?> deleteClientById(@PathVariable(name = "idClient") Long idClient) {
        if(idClient == null) {
            return ResponseEntity.badRequest().body("Cannot delete client with null id");
        }
        Client client = clientService.getClientById(idClient);
        if(client == null) {
            return ResponseEntity.notFound().build();
        }
        clientService.deleteClient(client);
        return ResponseEntity.ok().body(client);
    }
}
