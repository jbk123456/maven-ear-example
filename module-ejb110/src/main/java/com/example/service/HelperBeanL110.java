package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL110 {

    @EJB
    private HelperBeanK110 helperBeanK110;

    public String identify() {
        return "HelperBeanL110";
    }
}
