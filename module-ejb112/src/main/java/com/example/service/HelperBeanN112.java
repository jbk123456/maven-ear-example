package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN112 {

    @EJB
    private HelperBeanM112 helperBeanM112;

    public String identify() {
        return "HelperBeanN112";
    }
}
