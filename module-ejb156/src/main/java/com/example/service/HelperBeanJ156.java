package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ156 {

    @EJB
    private HelperBeanI156 helperBeanI156;

    public String identify() {
        return "HelperBeanJ156";
    }
}
