package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN126 {

    @EJB
    private HelperBeanM126 helperBeanM126;

    public String identify() {
        return "HelperBeanN126";
    }
}
