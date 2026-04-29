package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG21 {

    @EJB
    private HelperBeanF21 helperBeanF21;

    public String identify() {
        return "HelperBeanG21";
    }
}
