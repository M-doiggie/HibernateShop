package com.doig.portfolio.hibernateshop.mapper;

import com.doig.portfolio.hibernateshop.dto.PurchasableItemDTO;
import com.doig.portfolio.hibernateshop.entity.PurchasableItem;

public class PurchasableItemMapper {

    public static PurchasableItemDTO mapToItemDTO(PurchasableItem purchasableItem) {
        return new PurchasableItemDTO(purchasableItem.getId(), purchasableItem.getName(), purchasableItem.getPrice());
    }

    public static PurchasableItem mapToItem(PurchasableItemDTO purchasableItemDTO) {
        return new PurchasableItem(purchasableItemDTO.getId(), purchasableItemDTO.getName(), purchasableItemDTO.getPrice());
    }

}
