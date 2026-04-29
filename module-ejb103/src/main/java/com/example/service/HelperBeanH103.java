package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH103 {

    @EJB
    private HelperBeanG103 helperBeanG103;

    public String identify() {
        return "HelperBeanH103";
    }
}
