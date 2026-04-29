package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI84 {

    @EJB
    private HelperBeanH84 helperBeanH84;

    public String identify() {
        return "HelperBeanI84";
    }
}
