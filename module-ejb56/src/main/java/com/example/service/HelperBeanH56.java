package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH56 {

    @EJB
    private HelperBeanG56 helperBeanG56;

    public String identify() {
        return "HelperBeanH56";
    }
}
