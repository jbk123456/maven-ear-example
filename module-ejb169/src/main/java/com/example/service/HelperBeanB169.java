package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB169 {

    @EJB
    private HelperBeanA169 helperBeanA169;

    public String identify() {
        return "HelperBeanB169";
    }
}
