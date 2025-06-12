package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HeadsetTest {

/*************************************************************************************************/

    @Test
    public void test01InstanceOfHeadsetIsNotNull (){

        Headset headset = new Headset();
        Assertions.assertNotNull(headset);
    }

/*************************************************************************************************/

    @Test
    public void test02DeliveryDateOfDeviceIsTheDateOfInstanceCreation (){

        Headset headset = new Headset();
        LocalDate today = LocalDate.now();
        Assertions.assertEquals(today,headset.getDeliveriDay() );

    }

/*************************************************************************************************/
/*************************************************************************************************/


}