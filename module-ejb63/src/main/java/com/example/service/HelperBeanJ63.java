package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ63 {

    @EJB
    private HelperBeanI63 helperBeanI63;

    public String identify() {
        return "HelperBeanJ63";
    }
}
