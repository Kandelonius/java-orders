package com.lambdashane.javaorders.repositories;

import com.lambdashane.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
}
