package com.stock.pstock.controller;

import com.stock.pstock.bean.Client;
import com.stock.pstock.dao.ClientDao;
import com.stock.pstock.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }
    @GetMapping("/code/{code}")
    public Client findByCode(@PathVariable String code) {
        return clientService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return clientService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }


}
