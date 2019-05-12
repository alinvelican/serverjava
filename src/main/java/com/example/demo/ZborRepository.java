package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ZborRepository extends CrudRepository<Zbor,String> {
    public Optional<Zbor> findById(Integer zborId);
}
