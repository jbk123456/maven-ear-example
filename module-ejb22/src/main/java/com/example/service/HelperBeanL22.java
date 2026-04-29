package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL22 {

    @EJB
    private HelperBeanK22 helperBeanK22;

    public String identify() {
        return "HelperBeanL22";
    }
}
