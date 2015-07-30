package br.com.caelum.casadocodigo.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCServlet extends AbstractAnnotationConfigDispatcherServletInitializer
{

   @Override
   protected Class<?>[] getRootConfigClasses()
   {
      return new Class[] { AppWebConfiguration.class };
   }

   @Override
   protected Class<?>[] getServletConfigClasses()
   {
      return new Class[]{AppWebConfiguration.class, JPAConfiguration.class};
   }

   @Override
   protected String[] getServletMappings()
   {
      return new String[] { "/" };
   }
   

}