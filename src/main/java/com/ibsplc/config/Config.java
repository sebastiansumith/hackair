package com.ibsplc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibsplc.wsdl.ndc.NdcResService;

/**
 * Created by sumithsebastian on 6/6/18.
 */
@Configuration()
public class Config {

  @Bean()
  public NdcResService ndcResService(){
    NdcResService ndcResService = new NdcResService();
    return ndcResService;
  }
}
