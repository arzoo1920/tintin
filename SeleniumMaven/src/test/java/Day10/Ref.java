package Day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.testng.annotations.Test;



@Test
public class Ref {
  public void f() throws Exception 
  {
	  Class cl=Class.forName("org.openqa.slenium.firefox.FirefoxDriver");
	  
	  Constructor[] cs=cl.getConstructors();
	  for(Constructor C:cs)
	  {
		  System.out.println(C.getName());
	  }
	  
	  Field[] df= cl.getDeclaredFields();
	  for(Field f:df)
	  {
		  System.out.println(f.getName());
	  }
	  System.out.println(cl.getSuperclass());
	  
	  Method[] md=cl.getMethods();
	  for(Method m:md)
	  {
		  System.out.println(m.getName());
		 Parameter  pm[]=m.getParameters();
		 for(Parameter p:pm)
		 {
			 System.out.println(p.getP);
		 }
	  }
  }
}
