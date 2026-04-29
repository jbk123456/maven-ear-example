package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL9 {

    @EJB
    private HelperBeanK9 helperBeanK9;

    public String identify() {
        return "HelperBeanL9";
    }
}
