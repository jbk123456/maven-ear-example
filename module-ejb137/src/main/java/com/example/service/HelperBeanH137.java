package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH137 {

    @EJB
    private HelperBeanG137 helperBeanG137;

    public String identify() {
        return "HelperBeanH137";
    }
}
