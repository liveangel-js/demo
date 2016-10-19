package com.example.dao;

import com.example.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by liveangel on 2016-10-17.
 */
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageable);
    public Customer findByEmail(String email);
    List<Customer> findByLastName(String lastName);
}
