/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class reflection
{
	public static void main(String[] args) throws Exception {
		cat c =new cat("snowwhite",2);
		Field [] catfields=c.getClass().getDeclaredFields();
		
		for(Field field:catfields){
		    if(field.getName().equals("name")){
		        field.setAccessible(true);
		        field.set(c,"james mgill");
		    }
		}
		
		System.out.println(c.getname());
		
		Method[] catmethods=c.getClass().getDeclaredMethods();
		
		for(Method method :catmethods){
		    
		    if(method.getName().equals("thisisapublicmethod")){
		        method.setAccessible(true);
		        method.invoke(null);
		    }
		    
		}
	
	}
}
