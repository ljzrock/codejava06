import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// 成员方法（方法）
       /*不在主方法（main）里面的方法叫成员方法 
        * 即程序员自定义类 里面的变量叫成员变量 方法叫成员方法
        * 1）下面需要创建一个preson类 并且创建一个成员方法 输出“我是一个好人”
        * 通过创建对象来实现条用成员方法
        * 2) 添加 cal01 成员方法,可以计算从 1+..+1000 的结果
          3) 添加 cal02 成员方法,该方法可以接收一个数 n，计算从 1+..+n 的结果
          4) 添加 getSum 成员方法,可以计算两个数的和
        * 代码如下：
        * */
		System.out.println("请输入一个数：");
	    Scanner myScanner = new Scanner(System.in);
	    int num = myScanner.nextInt();
		System.out.println("请输入第一个加数：");
	    int num1 = myScanner.nextInt();
		System.out.println("请输入第二个加数：");
		int num2 = myScanner.nextInt();
		preson p1 = new preson();
		p1.speak();//调用成员方法speak
		p1.cal01();//调用成员方法cal01
		p1.cal02(num);//调用成员方法cal02
		int returnres = p1.getSum(num1,num2);//调用成员方法getSum
		System.out.println("getSum返回值是："+returnres);
		
	}
	

}
class preson{//自定义类（非主类（main））
	String name;//成员变量
	int age;//成员变量
	//输出一句话
	public void speak(){//成员方法
		System.out.println("我是一个好人！");
	}
	//成员方法计算1+2+3+...+1000
	public void cal01() {
		int sum = 0;
		for(int i = 1 ;i <= 1000;i++) {
			sum += i;
		}
		System.out.println("1-1000每个数的和是："+sum);
	}
//	//要求键入一个数n求1+2+。。。+n
//	public void cal02() {
//		
//		int n = myScanner.nextInt();
//		int sum = 0;
//		for(int i = 1 ;i <= n;i++) {
//			sum += i;
//		}
//		System.out.println("1到"+n+"之间每个数的和是："+sum);
//	}
//	//求两个数的和
//	public void getSum() {
//		int num1 = 10,num2 = 19;
//		int sum = num1 + num2;
//		System.out.println("两数的和是："+sum);
	//注释的是原始方法
//	}
	//要求键入一个数n求1+2+。。。+n
	public void cal02(int n) {
		int res = 0;
		for(int i = 1;i <= n;i++) {
			res += i;		
		}
		System.out.println("计算的和是:"+res);
	}
	//求两个数的和
	//int表示该成员方法有一个返回值 该值类型是int型
	public int getSum(int num1,int num2) {
		int res = num1 + num2;
	    return res;
	}

}
