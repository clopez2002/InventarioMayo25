package com.InventarioMayo25.demo.CRUD.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "userTable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;


}
