package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@RequiredArgsConstructor
public abstract class Device {

    private String name;

    private LocalDate deliveryDate;

    private LocalDate returnDate;

    private LocalDate breakDate;

    private int numberOfDevice;

/*******************************************************************/

    public Device (){
        this.deliveryDate = LocalDate.now();
    }

/*******************************************************************/

    public Object getDeliveriDay() {
        return deliveryDate;
    }


/*******************************************************************/




/*******************************************************************/
/*******************************************************************/

}
