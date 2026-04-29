package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI35 {

    @EJB
    private HelperBeanH35 helperBeanH35;

    public String identify() {
        return "HelperBeanI35";
    }
}
