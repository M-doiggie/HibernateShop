package com.doig.portfolio.hibernateshop.repository;

import com.doig.portfolio.hibernateshop.entity.PurchasableItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasableItemRepository extends JpaRepository<PurchasableItem, Long> {

}
