package com.InventarioMayo25.demo.CRUD.Controller;

import com.InventarioMayo25.demo.CRUD.Entity.Computer;
import com.InventarioMayo25.demo.CRUD.Services.ComputerServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    @Autowired
    private ComputerServiceImplementation computerServiceImplementation;

/*******************************************************************/

    @GetMapping("/homeInventoryURL")
    public String home(Model model){

        // 1° obtener la lista de computadoras de la BBDD

            Iterable <Computer> computerList = (Iterable<Computer>) computerServiceImplementation.getComputersList ();

        // Agregamos la lista al modelo y luego mostrarlo en el HTML

            model.addAttribute("computerListAttributes", computerList);

      return "homePageFile";
    }

/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
}
