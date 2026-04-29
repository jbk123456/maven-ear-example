package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL138 {

    @EJB
    private HelperBeanK138 helperBeanK138;

    public String identify() {
        return "HelperBeanL138";
    }
}
