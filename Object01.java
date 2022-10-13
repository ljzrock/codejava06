
public class Object01 {

	public static void main(String[] args) {
		// 类与对象 分开来看 
		/*1,类是描述对象的
		 * 2，对象是类的具体体现
		 * 3，创建一个书类 Book
		 * 要求：书名 作者 价格 发行量
		 * 然后输出和该书的具体信息
		 * */
		Book book1 = new Book();//创建书对象 
		book1.name = "三国演义";//给对象赋名称
		book1.authtr = "罗贯中";//赋作者
		book1.price = 56; //赋价格
		book1.circulation = 2300000;//赋发行量
		System.out.println("该书的信息："+"\n"+book1.name+"\n"+book1.authtr
				+"\n"+book1.price+"元\n"+book1.circulation+"的发行量");
		//输出该书的基本信息

	}

}


class Book {            //自定义书类
	   //属性/成员变量
      String name;//书名
      String authtr;//作者
      double price;//价格
      long  circulation;//发行量
}
