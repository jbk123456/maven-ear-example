package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM171 {

    @EJB
    private HelperBeanL171 helperBeanL171;

    public String identify() {
        return "HelperBeanM171";
    }
}
