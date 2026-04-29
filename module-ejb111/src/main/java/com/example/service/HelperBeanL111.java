package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL111 {

    @EJB
    private HelperBeanK111 helperBeanK111;

    public String identify() {
        return "HelperBeanL111";
    }
}
