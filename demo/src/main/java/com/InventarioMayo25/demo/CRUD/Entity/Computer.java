package com.InventarioMayo25.demo.CRUD.Entity;

import com.InventarioMayo25.demo.CRUD.Entity.Devices.Device;
import com.InventarioMayo25.demo.CRUD.Entity.Devices.Headset;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "computerTable")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int identification;

    private String serial;

    private String brand;

    private String model;

    private String type;

    private String department;

    private int year;

    private int ram;

    private int hdd;

    private String gpu;

    @OneToOne
    private User user;

    @ManyToMany
    private List<Headset> devices;



}
