package com.nttdata.co.pruebabackend.utils;

import com.nttdata.co.pruebabackend.config.exception.NotFoundErrorException;
import com.nttdata.co.pruebabackend.dto.ClientInfo;
import java.util.logging.Logger;

public class ClientFuncs {

    static final Logger logger = Logger.getLogger(ClientFuncs.class.getName());

    public static ClientInfo getClientInfo(String documentType, String documentNumber) {
        Utils.loggerInfo("Iniciando getClientInfo...");
        if ("SetError".equals(documentType)) {
            int[] inty = new int[3];
            for (int i = 0; i < 10; i++) {
                inty[i] = i;
            }
        }
        if ("23445322".equals(documentNumber)) {
            Utils.loggerInfo("Finalizando getClientInfo, dNumber:23445322");
            return new ClientInfo().fillAll();
        }
        throw new NotFoundErrorException("Not Found");
    }

    private ClientFuncs() {
    }
}
