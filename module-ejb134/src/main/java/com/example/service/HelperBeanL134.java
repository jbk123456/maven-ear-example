package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL134 {

    @EJB
    private HelperBeanK134 helperBeanK134;

    public String identify() {
        return "HelperBeanL134";
    }
}
