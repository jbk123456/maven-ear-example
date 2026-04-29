package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO165 {

    @EJB
    private HelperBeanN165 helperBeanN165;

    public String identify() {
        return "HelperBeanO165";
    }
}
