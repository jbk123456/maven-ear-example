package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL60 {

    @EJB
    private HelperBeanK60 helperBeanK60;

    public String identify() {
        return "HelperBeanL60";
    }
}
