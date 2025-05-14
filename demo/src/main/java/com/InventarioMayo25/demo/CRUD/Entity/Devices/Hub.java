package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hubTable")
public class Hub extends Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
