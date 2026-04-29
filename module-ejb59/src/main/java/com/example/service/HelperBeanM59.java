package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM59 {

    @EJB
    private HelperBeanL59 helperBeanL59;

    public String identify() {
        return "HelperBeanM59";
    }
}
