package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ66 {

    @EJB
    private HelperBeanI66 helperBeanI66;

    public String identify() {
        return "HelperBeanJ66";
    }
}
