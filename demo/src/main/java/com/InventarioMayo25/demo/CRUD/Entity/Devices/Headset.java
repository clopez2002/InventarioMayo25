package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "headsetTable")
public class Headset extends Device{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

/*************************************************************************************************/

    public Headset (){

    }

/*************************************************************************************************/
/*************************************************************************************************/
/*************************************************************************************************/




}
