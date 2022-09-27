package com.nttdata.co.pruebabackend.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.co.pruebabackend.dto.ClientInfo;
import com.nttdata.co.pruebabackend.utils.ClientFuncs;

@RestController
@RequestMapping(value = "api/client")
public class Client {
    final Logger logger = Logger.getLogger(Client.class.getName());

    @GetMapping
    @ResponseBody
    public ClientInfo getClientInfoRequestParam(@RequestParam String documentType,
            @RequestParam String documentNumber) {
        return ClientFuncs.getClientInfo(documentType, documentNumber);
    }

    @GetMapping("path/{documentType}/{documentNumber}")
    @ResponseBody
    public ClientInfo getClientInfoPathVariable(@PathVariable String documentType,
            @PathVariable String documentNumber) {
        return ClientFuncs.getClientInfo(documentType, documentNumber);
    }

}
