package com.doig.portfolio.hibernateshop.service.impl;

import com.doig.portfolio.hibernateshop.dto.PurchasableItemDTO;
import com.doig.portfolio.hibernateshop.entity.PurchasableItem;
import com.doig.portfolio.hibernateshop.mapper.PurchasableItemMapper;
import com.doig.portfolio.hibernateshop.repository.PurchasableItemRepository;
import com.doig.portfolio.hibernateshop.service.PurchasableItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PurchasableItemServiceImpl implements PurchasableItemService {

    private PurchasableItemRepository itemRepository;

    @Override
    public PurchasableItemDTO createItem(PurchasableItemDTO itemDTO) {
        PurchasableItem item = PurchasableItemMapper.mapToItem(itemDTO);

        PurchasableItem savedItem = itemRepository.save(item);

        return PurchasableItemMapper.mapToItemDTO(savedItem);
    }

    @Override
    public PurchasableItemDTO getItemById(Long itemId) {
        return PurchasableItemMapper.mapToItemDTO(itemRepository.getReferenceById(itemId));
    }

    @Override
    public List<PurchasableItemDTO> getAllItems() {
        List<PurchasableItem> items = itemRepository.findAll();

        return items.stream().map(PurchasableItemMapper::mapToItemDTO).collect(Collectors.toList());
    }
}
