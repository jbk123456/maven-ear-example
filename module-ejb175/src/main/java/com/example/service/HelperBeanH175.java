package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH175 {

    @EJB
    private HelperBeanG175 helperBeanG175;

    public String identify() {
        return "HelperBeanH175";
    }
}
