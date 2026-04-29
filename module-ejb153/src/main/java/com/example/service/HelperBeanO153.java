package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO153 {

    @EJB
    private HelperBeanN153 helperBeanN153;

    public String identify() {
        return "HelperBeanO153";
    }
}
