/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpro;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Springpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Resource resource=new ClassPathResource("appcon.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Student student=(Student)factory.getBean("studentbean");
	student.displayInfo();
    }
    
}
