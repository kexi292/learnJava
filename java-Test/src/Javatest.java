
public class Javatest {
	
	
	
	 /**面向对象基础-方法重载
	  * 关键是参数不同，返回类型一般相同*/
	 public static void main(String[] args) {
	        String s = "Test string";
	        int n1 = s.indexOf('t');
	        int n2 = s.indexOf("st");
	        int n3 = s.indexOf("st", 4);
	        System.out.println(n1);
	        System.out.println(n2);
	        System.out.println(n3);
	    }
}
