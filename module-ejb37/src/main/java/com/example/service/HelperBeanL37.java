package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL37 {

    @EJB
    private HelperBeanK37 helperBeanK37;

    public String identify() {
        return "HelperBeanL37";
    }
}
