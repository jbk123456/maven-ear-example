package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ131 {

    @EJB
    private HelperBeanI131 helperBeanI131;

    public String identify() {
        return "HelperBeanJ131";
    }
}
