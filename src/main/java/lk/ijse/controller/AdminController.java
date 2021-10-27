package lk.ijse.controller;

import lk.ijse.dto.AdminDTO;
import lk.ijse.service.AdminService;
import lk.ijse.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
        ArrayList<AdminDTO> alladmin = adminService.getAllAdmin();
        return new ResponseEntity(new StandradResponse("200", "Done", alladmin), HttpStatus.OK);

    }
}
