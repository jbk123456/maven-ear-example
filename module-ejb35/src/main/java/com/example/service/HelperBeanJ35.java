package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ35 {

    @EJB
    private HelperBeanI35 helperBeanI35;

    public String identify() {
        return "HelperBeanJ35";
    }
}
