package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ19 {

    @EJB
    private HelperBeanI19 helperBeanI19;

    public String identify() {
        return "HelperBeanJ19";
    }
}
