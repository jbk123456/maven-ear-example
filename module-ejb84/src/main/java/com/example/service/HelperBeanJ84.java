package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ84 {

    @EJB
    private HelperBeanI84 helperBeanI84;

    public String identify() {
        return "HelperBeanJ84";
    }
}
