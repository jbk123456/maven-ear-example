package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH135 {

    @EJB
    private HelperBeanG135 helperBeanG135;

    public String identify() {
        return "HelperBeanH135";
    }
}
