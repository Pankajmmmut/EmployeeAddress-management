package com.assignment.EmployeeAddress.repository;

import com.assignment.EmployeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
