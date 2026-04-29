package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH54 {

    @EJB
    private HelperBeanG54 helperBeanG54;

    public String identify() {
        return "HelperBeanH54";
    }
}
