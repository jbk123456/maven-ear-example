package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH147 {

    @EJB
    private HelperBeanG147 helperBeanG147;

    public String identify() {
        return "HelperBeanH147";
    }
}
