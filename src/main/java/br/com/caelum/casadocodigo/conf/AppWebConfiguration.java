package br.com.caelum.casadocodigo.conf;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.cache.CacheBuilder;

@EnableWebMvc
@EnableCaching
@ComponentScan(basePackages = "br.com.caelum.casadocodigo")
public class AppWebConfiguration extends WebMvcConfigurerAdapter
{

   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
   {
      configurer.enable();
   }
   
   @Bean
   public CacheManager cacheManager() {
	   CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder()
			   .maximumSize(20)
			   .expireAfterAccess(24, TimeUnit.HOURS);
	   GuavaCacheManager cacheManager = new GuavaCacheManager();
	   cacheManager.setCacheBuilder(cacheBuilder);

	   return cacheManager;
   }
}
