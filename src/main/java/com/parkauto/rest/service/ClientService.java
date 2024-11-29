package com.parkauto.rest.service;

import com.parkauto.rest.entity.Client;
import com.parkauto.rest.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ClientService {
    @Autowired
    IClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(Long idClient) {
        return clientRepository.findById(idClient).orElseThrow(() -> new RuntimeException("Client not found"));
    }

    public void  deleteClient(Client client) {
        clientRepository.delete(client);
    }
}
