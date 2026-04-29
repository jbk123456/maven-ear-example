package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB50 {

    @EJB
    private HelperBeanA50 helperBeanA50;

    public String identify() {
        return "HelperBeanB50";
    }
}
