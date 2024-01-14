package com.example.storeservice.service;

import com.example.storeservice.model.StoreItem;
import com.example.storeservice.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository repo;

    public StoreItem addItem(StoreItem item){
        return repo.save(item);
    }

    public List<StoreItem> getAllItems(){
        return repo.findAll();
    }
}
