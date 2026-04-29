package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH124 {

    @EJB
    private HelperBeanG124 helperBeanG124;

    public String identify() {
        return "HelperBeanH124";
    }
}
