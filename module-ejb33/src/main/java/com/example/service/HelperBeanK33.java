package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK33 {

    @EJB
    private HelperBeanJ33 helperBeanJ33;

    public String identify() {
        return "HelperBeanK33";
    }
}
