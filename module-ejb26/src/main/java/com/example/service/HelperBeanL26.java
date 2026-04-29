package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL26 {

    @EJB
    private HelperBeanK26 helperBeanK26;

    public String identify() {
        return "HelperBeanL26";
    }
}
