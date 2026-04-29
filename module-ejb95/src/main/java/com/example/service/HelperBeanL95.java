package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL95 {

    @EJB
    private HelperBeanK95 helperBeanK95;

    public String identify() {
        return "HelperBeanL95";
    }
}
