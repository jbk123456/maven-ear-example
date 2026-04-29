package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK43 {

    @EJB
    private HelperBeanJ43 helperBeanJ43;

    public String identify() {
        return "HelperBeanK43";
    }
}
