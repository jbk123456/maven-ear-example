package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI60 {

    @EJB
    private HelperBeanH60 helperBeanH60;

    public String identify() {
        return "HelperBeanI60";
    }
}
