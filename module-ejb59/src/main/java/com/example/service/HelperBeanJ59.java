package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ59 {

    @EJB
    private HelperBeanI59 helperBeanI59;

    public String identify() {
        return "HelperBeanJ59";
    }
}
