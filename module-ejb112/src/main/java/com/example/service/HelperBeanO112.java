package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO112 {

    @EJB
    private HelperBeanN112 helperBeanN112;

    public String identify() {
        return "HelperBeanO112";
    }
}
