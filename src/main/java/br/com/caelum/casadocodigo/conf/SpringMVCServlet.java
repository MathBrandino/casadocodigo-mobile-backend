package br.com.caelum.casadocodigo.conf;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.filter.CharacterEncodingFilter;
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
      return new Class[]{};
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
//		servletContext.addListener(RequestContextListener.class);
		servletContext.setInitParameter(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "dev");
		

		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter(
				"encoding-filter", new CharacterEncodingFilter());
		encodingFilter.setInitParameter("encoding", "UTF-8");
		encodingFilter.setInitParameter("forceEncoding", "true");
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
   }
}
