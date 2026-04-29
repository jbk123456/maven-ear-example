package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL70 {

    @EJB
    private HelperBeanK70 helperBeanK70;

    public String identify() {
        return "HelperBeanL70";
    }
}
