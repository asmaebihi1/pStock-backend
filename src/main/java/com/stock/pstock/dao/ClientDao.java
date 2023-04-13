package com.stock.pstock.dao;

import com.stock.pstock.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByCode(String code);
    int deleteByCode(String code);
}
