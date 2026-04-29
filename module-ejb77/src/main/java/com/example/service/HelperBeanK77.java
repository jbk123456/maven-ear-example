package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK77 {

    @EJB
    private HelperBeanJ77 helperBeanJ77;

    public String identify() {
        return "HelperBeanK77";
    }
}
