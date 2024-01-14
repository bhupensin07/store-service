package com.example.storeservice;

import com.example.storeservice.model.StoreItem;
import com.example.storeservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;
    @GetMapping("/action")
    public String sayHello(){
        return "Hello...";
    }

    @PostMapping("/addItem")
    public StoreItem addItem(@RequestBody StoreItem item){
        return storeService.addItem(item);
    }

    @GetMapping("/getAllItems")
    public List<StoreItem> getAllItems(){
        return storeService.getAllItems();
    }
}
