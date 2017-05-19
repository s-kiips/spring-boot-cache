package com.sudin.Config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Sudin Ranjitkar on 5/19/2017.
 */

@EnableJpaRepositories(basePackages = "com.sudin.Repository")
@EnableCaching
@Configuration
public class EhcacheConfiguration {

    @Bean
    public CacheManager cacheManager(){
        return new EhCacheCacheManager(cacheManagerFactory().getObject());
    }

    private EhCacheManagerFactoryBean cacheManagerFactory() {
        EhCacheManagerFactoryBean bean=new EhCacheManagerFactoryBean();
        bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        bean.setShared(true);
        return bean;
    }
}
