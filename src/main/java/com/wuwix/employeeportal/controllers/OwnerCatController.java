package com.wuwix.employeeportal.controllers;

import com.wuwix.employeeportal.dao.OwnerCatService;
import com.wuwix.employeeportal.domain.Cat;
import com.wuwix.employeeportal.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("ownercat")
@RestController
public class OwnerCatController {

    //One to one, Bidirectional
    @GetMapping("/create")
    public Owner saveUserController() {
        Cat cat = new Cat();
        Owner owner = new Owner("Marek", "Rzeźniak", cat);
        cat.setName("Szyszka");
        ownerCatService.saveOwner(owner, cat);
        ownerCatService.refresh(cat);
        return owner;
    }

    @GetMapping("/getall")
    public List<Owner> getOwnersController() {
        return ownerCatService.getAll();
    }

    @Autowired
    private OwnerCatService ownerCatService;

}
