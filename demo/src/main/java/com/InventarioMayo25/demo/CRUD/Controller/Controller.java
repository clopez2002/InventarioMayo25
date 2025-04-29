package com.InventarioMayo25.demo.CRUD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {

/*******************************************************************/

    @GetMapping("/homeInventoryURL")
    public String home(){

      return "homePageFile";
    }

/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
}
