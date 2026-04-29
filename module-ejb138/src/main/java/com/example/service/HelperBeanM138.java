package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM138 {

    @EJB
    private HelperBeanL138 helperBeanL138;

    public String identify() {
        return "HelperBeanM138";
    }
}
