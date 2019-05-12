package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ZborService {
    @Autowired
    private ZborRepository zborRepository;

    public Optional<Zbor> getOrg(Integer zborId) {
        return zborRepository.findById(zborId);
    }
    public Zbor getById(Integer id) {
        return zborRepository.findById(id).get();
    }
    public void saveOrg(Zbor org){


        zborRepository.save(org);

    }

    public void updateOrg(Zbor org){
        zborRepository.save(org);
    }

    public void deleteOrg(String org){
        zborRepository.delete(zborRepository.findById(Integer.parseInt(org)).get());
    }
    public List<Zbor> getAll() {
        List<Zbor> zborList = new ArrayList<>();
        zborRepository.findAll().forEach(zborList::add);
        return zborList;
    }
}
