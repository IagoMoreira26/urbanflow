package com.iagomoreira.urbanflow.controller;

import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.context.annotation.Import;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;

@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
public abstract class AbstractControllerTest {

}