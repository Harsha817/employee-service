package com.as2.EmployeeService.db.repo;


import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface EmployeeRepo  extends CouchbaseRepository<com.as2.EmployeeService.db.entity.EmployeeEntity, String> {

}

