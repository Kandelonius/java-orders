package com.lambdashane.javaorders.services;

import com.lambdashane.javaorders.models.Customer;
import com.lambdashane.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository custrepos;

    @Transactional
    @Override
    public Customer save(Customer restaurant)
    {
        return custrepos.save(restaurant);
    }
}
