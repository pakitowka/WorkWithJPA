package com.andrew.dataexam.service;

import com.andrew.dataexam.entity.Worker;

import java.util.List;

/**
 * Created by Andrew on 4/14/2015.
 */
public interface WorkerService {
    Worker addBank(Worker worker);
    void delete(long id);
    Worker getByName(String name);
    Worker editBank (Worker worker);
    List<Worker> getAll();
}
