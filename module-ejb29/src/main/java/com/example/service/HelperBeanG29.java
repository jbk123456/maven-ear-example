package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG29 {

    @EJB
    private HelperBeanF29 helperBeanF29;

    public String identify() {
        return "HelperBeanG29";
    }
}
