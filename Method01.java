
public class Method01 {

	public static void main(String[] args) {
		// int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		/*实现对上面数组遍历输出要求使用成员方法实现多次输出
		 * 
		 * */
		int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        Mytool tool = new Mytool();//创建tool对象
        tool.printArr(map);//调用成员方法实现数值遍历输出和
        System.out.println("=====================");
        tool.printArr(map);
        System.out.println("=====================");
        tool.printArr(map);
        System.out.println("=====================");
        tool.printArr(map);
        System.out.println("=====================");
        tool.printArr(map);
        //通过对成员方法的多次调用可以实现数组多次遍历输出
        //这使得成员方法能提高代码的重复利用
        //也可以将代码的实现封装起来待他人来调用
	}

}
 //创建Mytool类
class Mytool{//
  
	  public void printArr(int[][] map) {//创建成员方法printArr
		  for( int i = 0;i<map.length;i++) {
			  for(int j = 0;j<map[i].length;j++) {
				  System.out.print(map[i][j]+" ");//成员方法实现
			  }
			  System.out.println();//换行
		  }
		 
	  }
}