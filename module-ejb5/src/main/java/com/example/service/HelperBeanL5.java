package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL5 {

    @EJB
    private HelperBeanK5 helperBeanK5;

    public String identify() {
        return "HelperBeanL5";
    }
}
