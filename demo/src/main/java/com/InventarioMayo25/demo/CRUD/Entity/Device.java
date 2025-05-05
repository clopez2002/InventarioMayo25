package com.InventarioMayo25.demo.CRUD.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "userandlaptopDB")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int identificatoin;

    private String serial;

    private String brand;

    private String model;

    private String type;

    private String department;

    private int year;

    private int ram;

    private int hdd;

    private String gpu;

}
