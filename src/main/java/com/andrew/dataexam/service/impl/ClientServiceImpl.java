package com.andrew.dataexam.service.impl;

import com.andrew.dataexam.entity.Client;
import com.andrew.dataexam.repository.ClientRepository;
import com.andrew.dataexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addBank(Client client) {
        Client savedClient = clientRepository.saveAndFlush(client);
        return savedClient;
    }

    @Override
    public void delete(long id) {
        clientRepository.delete(id);

    }

    @Override
    public Client getByName(String name) {
        return clientRepository.findByName(name);
    }

    @Override
    public Client editBank(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
