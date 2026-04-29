package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH75 {

    @EJB
    private HelperBeanG75 helperBeanG75;

    public String identify() {
        return "HelperBeanH75";
    }
}
