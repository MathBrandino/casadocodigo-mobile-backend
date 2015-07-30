package br.com.caelum.casadocodigo.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.caelum.casadocodigo.controllers.LivroControllerHibernate;
import br.com.caelum.casadocodigo.dao.LivroDaoJPA;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.com.caelum.casadocodigo", basePackageClasses={LivroControllerHibernate.class, LivroDaoJPA.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter
{

   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
   {
      configurer.enable();
   }

}
