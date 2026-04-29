package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE98 {

    @EJB
    private HelperBeanD98 helperBeanD98;

    public String identify() {
        return "HelperBeanE98";
    }
}
