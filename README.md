# EmployeeAddress-management

A Spring-boot project.Project manage Employee and Address.
Showing one to one mapping.

## tools
### Framework
intelliJ IDEA MySQL

## dependencies -
Spring web, Validation, JPA, MySQL , lombok

## entities
### Employee
* empId
* emFirstName
* emLastName
* **Address foreign key**

### Address
* adId
* street
* city
* state
* zipCode

## packages
### controller
* EmployeeController and
* AddressController class

### model
contains 
* Employee.java and 
* Address.java class

### service
contains EmployeeService and Address.service class

### repository
conatains IEmployeerepo and IAddressRepo interface extends CrudRepository interface

## endpoints
add, get, update, delete

#Project Summary
This project is made for showing one to one mapping between two entity.
