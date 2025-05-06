package com.InventarioMayo25.demo.CRUD.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
@RequiredArgsConstructor
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
