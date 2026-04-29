package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ177 {

    @EJB
    private HelperBeanI177 helperBeanI177;

    public String identify() {
        return "HelperBeanJ177";
    }
}
