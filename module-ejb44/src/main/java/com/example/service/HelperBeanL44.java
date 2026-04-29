package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL44 {

    @EJB
    private HelperBeanK44 helperBeanK44;

    public String identify() {
        return "HelperBeanL44";
    }
}
