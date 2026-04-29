package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH29 {

    @EJB
    private HelperBeanG29 helperBeanG29;

    public String identify() {
        return "HelperBeanH29";
    }
}
