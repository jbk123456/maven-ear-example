package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO118 {

    @EJB
    private HelperBeanN118 helperBeanN118;

    public String identify() {
        return "HelperBeanO118";
    }
}
