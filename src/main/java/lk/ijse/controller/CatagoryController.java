package lk.ijse.controller;

import lk.ijse.dto.CatagoryDTO;
import lk.ijse.exeption.NotFoundException;
import lk.ijse.service.CatagoryService;
import lk.ijse.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class CatagoryController {
    @Autowired
    private CatagoryService catagoryService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCustomer(@RequestBody CatagoryDTO dto) {
        if (dto.getCatagoryID().trim().length() <= 0) {
            throw new NotFoundException("Customer id cannot be empty");
        }
        catagoryService.addCatagory(dto);
        return new ResponseEntity(new StandradResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
        ArrayList<CatagoryDTO> allCustomers = catagoryService.getAllCatagory();
        return new ResponseEntity(new StandradResponse("200", "Done", allCustomers), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchCustomer(@PathVariable String id) {
        CatagoryDTO catagoryDTO = catagoryService.searchCatagory(id);
        return new ResponseEntity(new StandradResponse("200", "Done", catagoryDTO), HttpStatus.OK);
    }


    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteCustomer(@RequestParam String id) {
        catagoryService.deleteCuatagory(id);
        return new ResponseEntity(new StandradResponse("200", "Done", null), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCustomer(@RequestBody CatagoryDTO dto) {
        if (dto.getCatagoryID().trim().length() <= 0) {
            throw new NotFoundException("No id provided to update");
        }
        catagoryService.updateCatagory(dto);
        return new ResponseEntity(new StandradResponse("200", "Done", dto), HttpStatus.OK);
    }

}
