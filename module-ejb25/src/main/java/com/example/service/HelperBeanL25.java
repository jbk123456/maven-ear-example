package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL25 {

    @EJB
    private HelperBeanK25 helperBeanK25;

    public String identify() {
        return "HelperBeanL25";
    }
}
