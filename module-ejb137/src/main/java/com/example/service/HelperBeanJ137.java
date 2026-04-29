package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ137 {

    @EJB
    private HelperBeanI137 helperBeanI137;

    public String identify() {
        return "HelperBeanJ137";
    }
}
