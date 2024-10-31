package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<String> getAllItems() {
        return itemRepository.findAll().stream()
                .map(Item::getName)
                .collect(Collectors.toList());
    }

    public String addItem(String itemName) {
        Item item = new Item(itemName);
        itemRepository.save(item);
        return "Item added: " + itemName;
    }

    public String deleteItem(String itemName) {
        var item = itemRepository.findByName(itemName);
        if (item.isPresent()) {
            itemRepository.delete(item.get());
            return "Item deleted: " + itemName;
        } else {
            return "Item not found: " + itemName;
        }
    }
}
