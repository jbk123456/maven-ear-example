package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG120 {

    @EJB
    private HelperBeanF120 helperBeanF120;

    public String identify() {
        return "HelperBeanG120";
    }
}
