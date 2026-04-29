package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ169 {

    @EJB
    private HelperBeanI169 helperBeanI169;

    public String identify() {
        return "HelperBeanJ169";
    }
}
