package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ133 {

    @EJB
    private HelperBeanI133 helperBeanI133;

    public String identify() {
        return "HelperBeanJ133";
    }
}
