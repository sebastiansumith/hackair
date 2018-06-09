package com.ibsplc.service;

import org.iata.iata.edist.AirShoppingRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibsplc.wsdl.ndc.NdcResService;

/**
 * Created by sumithsebastian on 6/6/18.
 */
@Component()
public class AirShoppingServiceImpl {

  @Autowired()
  private NdcResService ndcResService;

  public void shopRes(final AirShoppingRQ airShoppingRQ){

  }
}
