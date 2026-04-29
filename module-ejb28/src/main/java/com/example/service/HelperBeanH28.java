package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH28 {

    @EJB
    private HelperBeanG28 helperBeanG28;

    public String identify() {
        return "HelperBeanH28";
    }
}
