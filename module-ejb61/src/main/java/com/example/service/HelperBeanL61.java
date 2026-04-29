package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL61 {

    @EJB
    private HelperBeanK61 helperBeanK61;

    public String identify() {
        return "HelperBeanL61";
    }
}
