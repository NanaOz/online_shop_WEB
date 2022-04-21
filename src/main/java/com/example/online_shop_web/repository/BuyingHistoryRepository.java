package com.example.online_shop_web.repository;

import com.example.online_shop_web.entity.BuyingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyingHistoryRepository extends JpaRepository<BuyingHistory, Long> {
}
