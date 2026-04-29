package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO25 {

    @EJB
    private HelperBeanN25 helperBeanN25;

    public String identify() {
        return "HelperBeanO25";
    }
}
