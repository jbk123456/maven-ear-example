package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI131 {

    @EJB
    private HelperBeanH131 helperBeanH131;

    public String identify() {
        return "HelperBeanI131";
    }
}
