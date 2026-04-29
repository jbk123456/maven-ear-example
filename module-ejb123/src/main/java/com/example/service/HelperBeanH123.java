package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH123 {

    @EJB
    private HelperBeanG123 helperBeanG123;

    public String identify() {
        return "HelperBeanH123";
    }
}
