package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL48 {

    @EJB
    private HelperBeanK48 helperBeanK48;

    public String identify() {
        return "HelperBeanL48";
    }
}
