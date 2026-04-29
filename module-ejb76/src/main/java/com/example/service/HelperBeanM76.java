package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM76 {

    @EJB
    private HelperBeanL76 helperBeanL76;

    public String identify() {
        return "HelperBeanM76";
    }
}
