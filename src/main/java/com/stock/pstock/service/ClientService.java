package com.stock.pstock.service;


import com.stock.pstock.bean.Client;
import com.stock.pstock.dao.ClientDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientDao clientDao;

    public int save(Client client){
        if (findByCode(client.getCode()) != null) {
            return -1;
        }else{
            clientDao.save(client);
            return 1;
        }

    }

    public Client findByCode(String code) {
        return clientDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return clientDao.deleteByCode(code);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }


}
