package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO88 {

    @EJB
    private HelperBeanN88 helperBeanN88;

    public String identify() {
        return "HelperBeanO88";
    }
}
