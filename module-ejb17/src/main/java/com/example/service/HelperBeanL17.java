package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL17 {

    @EJB
    private HelperBeanK17 helperBeanK17;

    public String identify() {
        return "HelperBeanL17";
    }
}
