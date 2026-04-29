package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ77 {

    @EJB
    private HelperBeanI77 helperBeanI77;

    public String identify() {
        return "HelperBeanJ77";
    }
}
