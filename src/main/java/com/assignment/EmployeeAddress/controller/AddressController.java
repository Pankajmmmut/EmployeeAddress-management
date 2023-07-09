package com.assignment.EmployeeAddress.controller;

import com.assignment.EmployeeAddress.model.Address;
import com.assignment.EmployeeAddress.service.AddressService;
import com.assignment.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //get all address
    @GetMapping("addresses")
    public Iterable getAllAddresses(){
        return addressService.getAllAddresses();
    }
    //get an address by id
    @GetMapping("address/{adId}")
    public Optional getAddressbyId(@PathVariable Long adId){
        return addressService.getAddressbyId(adId);
    }
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}

