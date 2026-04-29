package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI63 {

    @EJB
    private HelperBeanH63 helperBeanH63;

    public String identify() {
        return "HelperBeanI63";
    }
}
