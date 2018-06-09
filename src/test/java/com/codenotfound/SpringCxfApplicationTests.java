package com.codenotfound;

import org.iata.iata.edist.AirShoppingRQ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibsplc.service.AirShoppingServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringCxfApplicationTests {

  @Autowired
  private AirShoppingServiceImpl airShoppingService;

  @Test
  public void testShopAir() {
    AirShoppingRQ airShoppingRQ = new AirShoppingRQ();
    airShoppingService.shopRes(airShoppingRQ);
  }
}
