package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL171 {

    @EJB
    private HelperBeanK171 helperBeanK171;

    public String identify() {
        return "HelperBeanL171";
    }
}
