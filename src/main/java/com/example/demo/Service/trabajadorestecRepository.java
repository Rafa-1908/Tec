package com.example.demo.Service;

import com.example.demo.Bean.trabajadorestecBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface trabajadorestecRepository extends CrudRepository<trabajadorestecBean, Integer> {

}

