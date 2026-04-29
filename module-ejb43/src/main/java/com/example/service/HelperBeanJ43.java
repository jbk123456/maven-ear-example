package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ43 {

    @EJB
    private HelperBeanI43 helperBeanI43;

    public String identify() {
        return "HelperBeanJ43";
    }
}
