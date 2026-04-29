package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH73 {

    @EJB
    private HelperBeanG73 helperBeanG73;

    public String identify() {
        return "HelperBeanH73";
    }
}
