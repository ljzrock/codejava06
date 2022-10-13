
public class MethodExercise02 {

	public static void main(String[] args) {
		//2) 根据行、列、字符打印 对应行数和 例如 4行4列 打印 #
		Print p = new Print();
		p.printChar(4, 4, '#');
	}

}
/*分析：先创建一个print类  再创建有一个方法printchar
 *        无返回值 void
 *        形参列表(int num , int num 2 ,char c)
 *         
 * 代码演示
 * */
class Print{
	public void printChar(int row,int col,char c) {
      for(int i = 0;i < row;i++) {
    	  for(int j = 0;j < col;j++ ) {
    		  System.out.print(c+" ");
    	  }
    	  System.out.println();
      }		
	
   }
}