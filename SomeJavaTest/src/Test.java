import com.qll.singleton.EnumSingleton;


public class Test {
	public static void main(String[] args){
		
		ClassLoadOrder clorder = new ClassLoadOrder();
		ClassLoadOrder.StaticInnerClass sinclass = new ClassLoadOrder.StaticInnerClass();
		sinclass.sinPrint();
		EnumSingleton es = EnumSingleton.INSTANCE;//获取单例
		es.print();
	}

}
