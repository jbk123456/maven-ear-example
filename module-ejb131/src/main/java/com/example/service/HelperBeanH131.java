package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH131 {

    @EJB
    private HelperBeanG131 helperBeanG131;

    public String identify() {
        return "HelperBeanH131";
    }
}
