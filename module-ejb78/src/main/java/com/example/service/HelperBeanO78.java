package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO78 {

    @EJB
    private HelperBeanN78 helperBeanN78;

    public String identify() {
        return "HelperBeanO78";
    }
}
