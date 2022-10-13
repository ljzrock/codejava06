
public class MethodExercise01 {

	public static void main(String[] args) {
		AA a = new  AA();
		a.isodd(1);
		if(a.isodd(4)) {
			System.out.println("是奇数");
			
		}else {
			System.out.println("是偶数");
		}


	}

}
//1) 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
/*分析：先创建一个AA类  再创建有一个方法isodd 返回值是boolean型
 * 代码演示
 * */
class AA{
	public boolean isodd(int num) {
//	if(num % 2 != 0) {
//		return true;
//	}	else {
//		return false;
//	}
		return num % 2 != 0;
	}
}