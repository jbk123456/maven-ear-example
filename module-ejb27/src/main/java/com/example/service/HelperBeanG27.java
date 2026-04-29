package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG27 {

    @EJB
    private HelperBeanF27 helperBeanF27;

    public String identify() {
        return "HelperBeanG27";
    }
}
