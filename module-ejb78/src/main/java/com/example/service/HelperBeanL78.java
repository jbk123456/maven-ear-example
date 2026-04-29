package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL78 {

    @EJB
    private HelperBeanK78 helperBeanK78;

    public String identify() {
        return "HelperBeanL78";
    }
}
