package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB112 {

    @EJB
    private HelperBeanA112 helperBeanA112;

    public String identify() {
        return "HelperBeanB112";
    }
}
