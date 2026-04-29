package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI26 {

    @EJB
    private HelperBeanH26 helperBeanH26;

    public String identify() {
        return "HelperBeanI26";
    }
}
