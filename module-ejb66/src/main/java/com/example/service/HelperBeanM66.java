package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM66 {

    @EJB
    private HelperBeanL66 helperBeanL66;

    public String identify() {
        return "HelperBeanM66";
    }
}
