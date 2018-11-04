package exercises.book01;


/**
 * Task1：
 * 利用反射实现通用的扩展数组长度的方法
 */
public class Ch16Task {
	
	static void print(Object arr) {
		if(arr.getClass().isArray()) {
			Object[] arr2 = (Object[]) arr;
			for(Object e: arr2) {
				if(e == null) {
					System.out.print("null ");
				} else {
					System.out.print(e+" ");				
				}				
			}
			System.out.println();
		}
	}
	
	//Java核心技术卷I 第5章继承  5.7.5节 
	public static Object goodCopyOf(Object a,int newLength){
        Class<?> cl =  a.getClass();
        if (!cl.isArray()) return null;
        Class<?> componentType = cl.getComponentType();
        int length = java.lang.reflect.Array.getLength(a);
        Object newArray = java.lang.reflect.Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return  newArray;
    }

	//我的尝试
	static Object changeArr(Object arr, int len) {
		Class<?> clazz = arr.getClass();
		Class<?> cl_component = clazz.getComponentType();
		
		Object newArr = null;
		return newArr;
	}
	
	public static void main(String[] args) {
		//定义数组
		System.out.println("===== 1 =====");
		Integer[] arr = new Integer[]{1,3,5,7};
		for(int e: arr) {
			System.out.print(e+" ");
		}
		System.out.println("\nlength = "+arr.length+"\n");
		
		//调用数组扩展方法
		System.out.println("===== 2 =====");
		Integer[] newArr = (Integer[]) Ch16Task.goodCopyOf(arr, 6);
		Ch16Task.print(newArr);
		System.out.println();
				
		//调用数组扩展方法
		System.out.println("===== 3 =====");		
		Integer[] newArr2 = (Integer[]) Ch16Task.changeArr(arr, 6);
		Ch16Task.print(newArr2);
		System.out.println();
		
		
	}
}
