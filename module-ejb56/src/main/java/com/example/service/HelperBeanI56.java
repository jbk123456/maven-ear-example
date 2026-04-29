package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI56 {

    @EJB
    private HelperBeanH56 helperBeanH56;

    public String identify() {
        return "HelperBeanI56";
    }
}
