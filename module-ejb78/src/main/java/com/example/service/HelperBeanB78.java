package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB78 {

    @EJB
    private HelperBeanA78 helperBeanA78;

    public String identify() {
        return "HelperBeanB78";
    }
}
