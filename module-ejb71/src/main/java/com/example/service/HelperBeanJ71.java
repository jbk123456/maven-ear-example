package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ71 {

    @EJB
    private HelperBeanI71 helperBeanI71;

    public String identify() {
        return "HelperBeanJ71";
    }
}
