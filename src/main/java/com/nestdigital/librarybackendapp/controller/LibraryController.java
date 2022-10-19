package com.nestdigital.librarybackendapp.controller;

import com.nestdigital.librarybackendapp.dao.LibraryDao;
import com.nestdigital.librarybackendapp.model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addbook",consumes = "application/json",produces = "application/json")
    public String library(@RequestBody LibraryModel library){
        dao.save(library);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewbook")
    public List<LibraryModel> viewbook(){
        return (List<LibraryModel>) dao.findAll();
    }
}
