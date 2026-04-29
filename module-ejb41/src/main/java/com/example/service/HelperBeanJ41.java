package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ41 {

    @EJB
    private HelperBeanI41 helperBeanI41;

    public String identify() {
        return "HelperBeanJ41";
    }
}
