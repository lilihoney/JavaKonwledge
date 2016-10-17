
public class ClassLoadOrder {
	private static String name = "ClassLoadOrder";
	private static long date = System.currentTimeMillis();
	private int flag = 1;
	
	static{
		System.out.println("初始化静态块：");
		System.out.println(name);
		System.out.println("static block:" +System.currentTimeMillis());
	}
	
	public ClassLoadOrder(){
		System.out.println("I am constructor" + System.currentTimeMillis());
	}

	//非静态方法可以调用静态属性
	public String getName(){
		return name;
	}
	
	public int getFlag(){
		return flag;
	}
	
	public static class StaticInnerClass{
		public static long date = System.currentTimeMillis();
		static{
			System.out.println("Static Inner Class static blodk： "+ date);
		}
		public StaticInnerClass(){
			System.out.println("I am a static inner class");
		}
		public void sinPrint(){
			System.out.println("static inner class method");
		}		
	}	

	private class GeneralInnerClass{
		public long mydate = System.currentTimeMillis();
		public GeneralInnerClass(){
			System.out.println("I am a general inner class");
		}
		public long getMyDate(){
			return mydate;
		}
	}
	
	public long getDate(){
		return StaticInnerClass.date;
	}
	
//	public long getGeneralInnerClass(){
//		return GeneralInnerClass.mydate;//不可以高用内部类中非静态成员变量及方法
//	}
	
	
	public static void main(String[] args){
		ClassLoadOrder clo = new ClassLoadOrder();
		ClassLoadOrder clo2 = new ClassLoadOrder();
		System.out.println("static inner class date : " + clo.getDate());
//		System.out.println("general inner class date: " + clo.getGeneralInnerClass());
		System.out.println("static inner class date : " + clo2.getDate());
		if(clo.getDate() == clo2.getDate()){
			System.out.println("静态内部类只加载了一次");
		}
//		System.out.println("general inner class date: " + clo2.getGeneralInnerClass());
	}
}
