package com.InventarioMayo25.demo.CRUD.Services;

import com.InventarioMayo25.demo.CRUD.Entity.Computer;
import com.InventarioMayo25.demo.CRUD.Repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImplementation implements ComputerServiceInterface{

    @Autowired
    private ComputerRepository computerRepository;

/*******************************************************************/
    public Iterable<Computer> getComputersList() {
        return computerRepository.findAll();
    }
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
    
}
