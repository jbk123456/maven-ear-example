package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF27 {

    @EJB
    private HelperBeanE27 helperBeanE27;

    public String identify() {
        return "HelperBeanF27";
    }
}
