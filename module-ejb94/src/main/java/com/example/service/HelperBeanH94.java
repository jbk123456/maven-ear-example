package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH94 {

    @EJB
    private HelperBeanG94 helperBeanG94;

    public String identify() {
        return "HelperBeanH94";
    }
}
