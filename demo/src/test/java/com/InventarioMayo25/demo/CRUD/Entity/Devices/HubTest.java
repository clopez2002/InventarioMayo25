package com.InventarioMayo25.demo.CRUD.Entity.Devices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HubTest {

/*******************************************************************/

    @Test
    public void test01InstanceOfHubIsNotNull (){

        Hub hub = new Hub();
        Assertions.assertNotNull(hub);
    }

/*******************************************************************/

    @Test
    public void test02HubCreatedAndDateAttachedAutomatically (){

        Hub hub = new Hub();
        LocalDate today = LocalDate.now();
        Assertions.assertEquals(today,hub.getDeliveriDay());

    }

/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/


}