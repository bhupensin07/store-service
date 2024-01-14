package com.example.storeservice.repo;

import com.example.storeservice.model.StoreItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoreItem, Integer> {
}
