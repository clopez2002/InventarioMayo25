package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "monitorTable")
public class Monitor extends Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String serialNumber;

    private String brand;

    private int size;
}
