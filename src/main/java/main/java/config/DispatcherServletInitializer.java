package main.java.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Tomcat will automatically find below class since it extends AbstractAnnota...
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //specify the config(s) for the built in Web IOC container
        //This IOC should contain Handler Mappings, controllers and view resolvers
        return new Class<?>[] {main.java.config.WebContextConfig.class};

    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}