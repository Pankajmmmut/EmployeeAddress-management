package com.assignment.EmployeeAddress.service;

import com.assignment.EmployeeAddress.model.Address;
import com.assignment.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable getAllAddresses() {
        return addressRepo.findAll();
    }

    public Optional getAddressbyId(Long adId) {
        return addressRepo.findById(adId);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "An address added.";
    }
}
