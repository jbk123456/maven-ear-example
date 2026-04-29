package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO137 {

    @EJB
    private HelperBeanN137 helperBeanN137;

    public String identify() {
        return "HelperBeanO137";
    }
}
