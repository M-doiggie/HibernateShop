package com.doig.portfolio.hibernateshop.service;

import com.doig.portfolio.hibernateshop.dto.PurchasableItemDTO;

import java.util.List;

public interface PurchasableItemService {
    PurchasableItemDTO createItem(PurchasableItemDTO item);

    PurchasableItemDTO getItemById(Long itemId);

    List<PurchasableItemDTO> getAllItems();
}
