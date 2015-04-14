package com.andrew.dataexam.service.impl;

import com.andrew.dataexam.entity.Worker;
import com.andrew.dataexam.repository.WorkerRepository;
import com.andrew.dataexam.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker addBank(Worker worker) {
        Worker savedWorker = workerRepository.saveAndFlush(worker);
        return savedWorker;
    }

    @Override
    public void delete(long id) {
        workerRepository.delete(id);
    }

    @Override
    public Worker getByName(String name) {
        return workerRepository.findByName(name);
    }

    @Override
    public Worker editBank(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public List<Worker> getAll() {
        return workerRepository.findAll();
    }
}
