package org.manohar.mangol.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.manohar.mangol.ManoharLogger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.manohar.mangol")
@EnableAspectJAutoProxy(proxyTargetClass=true)
@Aspect
public class AppConfig {
private static ManoharLogger logger = ManoharLogger.getLogger(MangolEnum.FRAMEWORK_LOG_APPENDER.getValue());
	/**
	    * logBefore is the point cut method which will be executed 
	     * on entering a method.
	    * 
	     * @param joinpoint
	    *           <p>Representing the entity which needs to be instrumented.</p>
	    */
	    @Before("within(org.manohar.mangol.config..*) || within(org.manohar.mangol.service..*)")
	    public void logBefore(JoinPoint joinpoint){          
			if (logger.isDebugEnabled()) {
				logger.entryPoint(joinpoint.getSignature().getDeclaringTypeName()
						+ "." + joinpoint.getSignature().getName());
			}
	    }
	    
	    /**
	     * logAfter is the point cut method which will be executed 
	      * on exiting a method.
	     * 
	      * @param joinpoint
	     *           <p>Representing the entity which needs to be instrumented.</p>
	     */
	 	 @After("within(org.manohar.mangol.config..*) || within(org.manohar.mangol.service..*)")
	 	    public void logAfter(JoinPoint joinpoint) {
	 			if (logger.isDebugEnabled()) {
	 				logger.exitPoint(joinpoint.getSignature().getDeclaringTypeName()
	 						+ "." + joinpoint.getSignature().getName());
	 			}
	 	    }
}
