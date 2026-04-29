package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO126 {

    @EJB
    private HelperBeanN126 helperBeanN126;

    public String identify() {
        return "HelperBeanO126";
    }
}
