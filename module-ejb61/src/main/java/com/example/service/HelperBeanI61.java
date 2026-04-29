package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI61 {

    @EJB
    private HelperBeanH61 helperBeanH61;

    public String identify() {
        return "HelperBeanI61";
    }
}
