package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH12 {

    @EJB
    private HelperBeanG12 helperBeanG12;

    public String identify() {
        return "HelperBeanH12";
    }
}
