package mx.uv.Aviones;
 
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
 
@EnableWs
@Configuration
public class Configuracion extends WsConfigurerAdapter {
 @Bean
 public XsdSchema avionesSchema() {
 return new SimpleXsdSchema(new ClassPathResource("esquema.xsd"));
 }
 
 @Bean
 public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
 MessageDispatcherServlet servlet = new MessageDispatcherServlet();
 servlet.setApplicationContext(applicationContext); 
 servlet.setTransformWsdlLocations(true);
 return new ServletRegistrationBean<>(servlet, "/ws/*");
 }
 
 @Bean(name = "aviones")
 public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema avionesSchema) {
 DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
 wsdl.setPortTypeName("avionesPort"); 
 wsdl.setLocationUri("/ws"); 
 wsdl.setTargetNamespace("https://t4is.uv.mx/aviones"); 
 wsdl.setSchema(avionesSchema);
 return wsdl;
 }
}