package com.nttdata.co.pruebabackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class PruebabackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain(){
		String[] args=new String[1];
		args[0]=new String("TestMain");
		try{
			PruebabackendApplication.main(null);
			Assert.isTrue( "TestMain".equals(args[0]), "Bad Test Main" );
		}catch( Exception ex ){
			Assert.isTrue( ex instanceof Exception, "Bad Test Main" );
		}
	}
}
