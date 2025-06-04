package com.InventarioMayo25.demo.CRUD.Repository;

import com.InventarioMayo25.demo.CRUD.Entity.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Integer> {
}
