package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH5 {

    @EJB
    private HelperBeanG5 helperBeanG5;

    public String identify() {
        return "HelperBeanH5";
    }
}
