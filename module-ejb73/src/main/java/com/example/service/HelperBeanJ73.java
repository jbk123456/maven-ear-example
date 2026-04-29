package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ73 {

    @EJB
    private HelperBeanI73 helperBeanI73;

    public String identify() {
        return "HelperBeanJ73";
    }
}
