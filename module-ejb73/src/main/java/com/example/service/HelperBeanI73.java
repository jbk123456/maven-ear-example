package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI73 {

    @EJB
    private HelperBeanH73 helperBeanH73;

    public String identify() {
        return "HelperBeanI73";
    }
}
