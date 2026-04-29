package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH26 {

    @EJB
    private HelperBeanG26 helperBeanG26;

    public String identify() {
        return "HelperBeanH26";
    }
}
