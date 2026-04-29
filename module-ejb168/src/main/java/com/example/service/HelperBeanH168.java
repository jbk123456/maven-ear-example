package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH168 {

    @EJB
    private HelperBeanG168 helperBeanG168;

    public String identify() {
        return "HelperBeanH168";
    }
}
