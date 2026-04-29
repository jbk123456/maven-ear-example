package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH31 {

    @EJB
    private HelperBeanG31 helperBeanG31;

    public String identify() {
        return "HelperBeanH31";
    }
}
