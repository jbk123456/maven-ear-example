package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO66 {

    @EJB
    private HelperBeanN66 helperBeanN66;

    public String identify() {
        return "HelperBeanO66";
    }
}
