package com.valhallacore.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;

public class HibernateAwareObjectMapper extends ObjectMapper {
    public HibernateAwareObjectMapper() {
            // This for Hibernate 5; change 5 to 4 if you need to support
            // Hibernate 4 instead
            registerModule(new Hibernate5JakartaModule());
        }
    }
