package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI78 {

    @EJB
    private HelperBeanH78 helperBeanH78;

    public String identify() {
        return "HelperBeanI78";
    }
}
