package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL80 {

    @EJB
    private HelperBeanK80 helperBeanK80;

    public String identify() {
        return "HelperBeanL80";
    }
}
