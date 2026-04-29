package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH78 {

    @EJB
    private HelperBeanG78 helperBeanG78;

    public String identify() {
        return "HelperBeanH78";
    }
}
