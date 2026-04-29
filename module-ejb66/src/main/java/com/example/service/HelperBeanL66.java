package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL66 {

    @EJB
    private HelperBeanK66 helperBeanK66;

    public String identify() {
        return "HelperBeanL66";
    }
}
