package br.com.caelum.casadocodigo.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.request.RequestContextListener;
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
   
   @Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		super.onStartup(servletContext);
		servletContext.addListener(RequestContextListener.class);
		servletContext.setInitParameter("spring.profiles.active", "dev");
   }
   

}
