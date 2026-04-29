package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL28 {

    @EJB
    private HelperBeanK28 helperBeanK28;

    public String identify() {
        return "HelperBeanL28";
    }
}
