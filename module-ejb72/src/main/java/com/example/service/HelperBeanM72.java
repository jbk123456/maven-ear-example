package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM72 {

    @EJB
    private HelperBeanL72 helperBeanL72;

    public String identify() {
        return "HelperBeanM72";
    }
}
