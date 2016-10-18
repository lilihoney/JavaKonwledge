import java.util.EnumSet;

import com.qll.singleton.EnumSingleton;
import com.qll.singleton.Foo;


public class Test {
	public static void main(String[] args){
		
		ClassLoadOrder clorder = new ClassLoadOrder();
		ClassLoadOrder.StaticInnerClass sinclass = new ClassLoadOrder.StaticInnerClass();
		sinclass.sinPrint();
		EnumSingleton es = EnumSingleton.INSTANCE;//获取单例
		es.print();
		
		//test enum
		System.out.println("枚举类测试");
		int[] narray = new int[]{1,2,3,4,5};
		System.out.println("Foo.RED = " + Foo.RED);
		System.out.println("Foo.RED.ordinal() = " + Foo.RED.ordinal());
		System.out.println("Foo.GRY.ordinal() = " + Foo.GRY.ordinal());
		System.out.println("Foo.class.toString() = " + Foo.class.toString());
		System.out.println("Foo.class.getDeclaringClass() = " + Foo.class.getDeclaringClass());
		if("RED".equals(Foo.RED.name()))
			System.out.println("RED.equals(Foo.RED.name())");
		//遍历Enum类----EnumSet
		System.out.println("遍历枚举类：");
		for(Foo f : EnumSet.range(Foo.RED, Foo.GRY)){
			System.out.println(f);
		}
		
		//测试switch case使用enum
		System.out.println("测试switch case使用enum:");
		String s = "RED";
		switch (Foo.valueOf(s)) {
		case RED:
			System.out.println("s = RED");
			break;

		default:
			break;
		}
	}

}
