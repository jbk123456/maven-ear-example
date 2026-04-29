package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI41 {

    @EJB
    private HelperBeanH41 helperBeanH41;

    public String identify() {
        return "HelperBeanI41";
    }
}
