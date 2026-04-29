package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM11 {

    @EJB
    private HelperBeanL11 helperBeanL11;

    public String identify() {
        return "HelperBeanM11";
    }
}
