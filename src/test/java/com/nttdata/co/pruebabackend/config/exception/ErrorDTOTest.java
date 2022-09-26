package com.nttdata.co.pruebabackend.config.exception;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ErrorDTOTest {
    static ErrorDTO errorDTO;
    @BeforeAll
    public static void beforeEach(){
        errorDTO = new ErrorDTO(
                "TIME", 200, "ERROR", "PATH"
        );
    }

    @Test
    public void testErrorDTO(){
        assertTrue(errorDTO instanceof ErrorDTO,"Error en testErrorDTO");
    }

    @Test
    public void testGetStatus(){
        assertEquals(200L, errorDTO.getStatus(),"Error en testGetStatus");
    }

    @Test
    public void testGetTimestamp(){
        assertEquals("TIME",errorDTO.getTimestamp(),"Error en testGetTimestamp");
    }

    @Test
    public void testSetTimestamp(){
        errorDTO.setTimestamp("TIME");
        assertEquals("TIME",errorDTO.getTimestamp(),"Error en testSetTimestamp");
    }

    @Test
    public void testSetStatus(){
        errorDTO.setStatus(200L);
        assertEquals(200L,errorDTO.getStatus(),"Error en testSetStatus");
    }

    @Test
    public void testGetError(){
        assertEquals("ERROR",errorDTO.getError(),"Error en testGetError");
    }

    @Test
    public void testSetError(){
        errorDTO.setError("ERROR");
        assertEquals("ERROR",errorDTO.getError(),"Error en testSetError");
    }

    @Test
    public void testGetPath(){
        assertEquals("PATH",errorDTO.getPath(),"Error en testGetError");
    }

    @Test
    public void testSetPath(){
        errorDTO.setPath("PATH");
        assertEquals("PATH",errorDTO.getPath(),"Error en testSetError");
    }



}
