package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonitorTest {

/*******************************************************************/

    @Test
    public void test01InstanceOfMonitorIsNotNull (){

        Monitor monitor = new Monitor();
        Assertions.assertNotNull(monitor);
    }

/*******************************************************************/

    @Test
    public void test02DeliveryDateIsTheDayOfCreationOfTheInstance (){

        Monitor monitor = new Monitor();
        LocalDate today = LocalDate.now();
        Assertions.assertEquals(today, monitor.getDeliveriDay());

    }

/*******************************************************************/
/*******************************************************************/


}