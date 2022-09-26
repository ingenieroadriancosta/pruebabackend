package com.nttdata.co.pruebabackend.config.exception;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.context.request.WebRequest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
class ExceptionConfigTest {

    @Before
    public void setup() {
    }

    @BeforeAll
    public static void beforeEach(){
    }

    @Test
    void testCatchBadRequestResponse() {
    }

    @Test
    void testCatchRequiredRequestParameter() {
    }

    @Test
    void testCatchInternalServerError() {
    }

    @Test
    void testCatchNotFoundError() {
    }

    @Test
    void testCatchServletRequestParameterPropertyValues() {
    }
}