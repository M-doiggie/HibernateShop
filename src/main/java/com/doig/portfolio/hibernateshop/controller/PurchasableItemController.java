package com.doig.portfolio.hibernateshop.controller;

import com.doig.portfolio.hibernateshop.dto.PurchasableItemDTO;
import com.doig.portfolio.hibernateshop.entity.PurchasableItem;
import com.doig.portfolio.hibernateshop.mapper.PurchasableItemMapper;
import com.doig.portfolio.hibernateshop.service.PurchasableItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class PurchasableItemController {
    private PurchasableItemService itemService;

    @PostMapping
    public ResponseEntity<PurchasableItemDTO> createPurchasableItem(@RequestBody PurchasableItem purchasableItem){
        PurchasableItemDTO item = itemService.createItem(PurchasableItemMapper.mapToItemDTO(purchasableItem));
        return null;
    }

}
