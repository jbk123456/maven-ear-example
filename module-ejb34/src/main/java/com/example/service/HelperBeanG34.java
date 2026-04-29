package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG34 {

    @EJB
    private HelperBeanF34 helperBeanF34;

    public String identify() {
        return "HelperBeanG34";
    }
}
