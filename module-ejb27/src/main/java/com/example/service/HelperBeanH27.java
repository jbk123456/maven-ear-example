package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH27 {

    @EJB
    private HelperBeanG27 helperBeanG27;

    public String identify() {
        return "HelperBeanH27";
    }
}
