package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH16 {

    @EJB
    private HelperBeanG16 helperBeanG16;

    public String identify() {
        return "HelperBeanH16";
    }
}
