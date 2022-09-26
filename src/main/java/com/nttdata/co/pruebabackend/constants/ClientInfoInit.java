package com.nttdata.co.pruebabackend.constants;

import com.nttdata.co.pruebabackend.structures.DocumentInformation;

public class ClientInfoInit {

    public static final String FIRSTNAME = "Adrian";
    public static final String SECONDNAME = "Jose";
    public static final String FIRSTSURENAME = "Costa";
    public static final String SECONDSURENAME = "Ospino";
    public static final long PHONENUMBER = 3_008_053_163L;
    public static final String ADDRESS = "Lexington Avenue y 42 Street";
    public static final String HOMECITY = "New York";

    public static final long IDNUMBER = 23445322;

    protected static final DocumentInformation[] DOCUMENTTYPES = {
            new DocumentInformation("C", "Cedula de ciudadania"),
            new DocumentInformation("P", "Pasaporte")
    };

    private ClientInfoInit() {
    }

}
