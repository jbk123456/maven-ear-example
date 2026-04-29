package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG156 {

    @EJB
    private HelperBeanF156 helperBeanF156;

    public String identify() {
        return "HelperBeanG156";
    }
}
