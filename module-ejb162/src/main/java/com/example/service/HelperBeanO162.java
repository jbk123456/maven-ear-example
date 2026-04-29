package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO162 {

    @EJB
    private HelperBeanN162 helperBeanN162;

    public String identify() {
        return "HelperBeanO162";
    }
}
