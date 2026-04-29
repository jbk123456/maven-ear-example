package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI28 {

    @EJB
    private HelperBeanH28 helperBeanH28;

    public String identify() {
        return "HelperBeanI28";
    }
}
