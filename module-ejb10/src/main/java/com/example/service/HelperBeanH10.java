package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH10 {

    @EJB
    private HelperBeanG10 helperBeanG10;

    public String identify() {
        return "HelperBeanH10";
    }
}
