package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL55 {

    @EJB
    private HelperBeanK55 helperBeanK55;

    public String identify() {
        return "HelperBeanL55";
    }
}
