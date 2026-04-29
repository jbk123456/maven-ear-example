package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG26 {

    @EJB
    private HelperBeanF26 helperBeanF26;

    public String identify() {
        return "HelperBeanG26";
    }
}
