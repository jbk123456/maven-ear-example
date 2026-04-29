package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG42 {

    @EJB
    private HelperBeanF42 helperBeanF42;

    public String identify() {
        return "HelperBeanG42";
    }
}
