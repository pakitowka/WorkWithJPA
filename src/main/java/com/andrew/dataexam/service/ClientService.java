package com.andrew.dataexam.service;


import com.andrew.dataexam.entity.Client;

import java.util.List;

public interface ClientService {
    Client addBank(Client client);
    void delete(long id);
    Client getByName(String name);
    Client editBank (Client client);
    List<Client> getAll();
}
