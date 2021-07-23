package day01;

public class Quiz01 {
	public static void main(String[] args) {
		
		System.out.println("이름\t"+"나이\t"+"전화번호\t\t"+"회비");
		System.out.println("홍길동\t\"15\"\t3672-1234\t\\20000");
		System.out.println("고길동\t\"15\"\t2238-1234\t\\30000");
		System.out.println("김말이\t\"15\"\t1234-1234\t\\50000");
		System.out.println("총합계\t\t\t" + "\t\\" + 100000);
		/*문제에서 숫자들은 숫자로 사용하라는게 무슨말인지 모르겠다
		"15"를 표현하기위해서는 양 바깥에 ("")를 사용하지 않으면 안되고
		바깥부분에 ""가 사용되면서 부터 괄호안의 출력되는 숫자들은 모두 문자열이 되는게 아닐가?
		*/
		System.out.println("홍길동\t\"15\"\t" +3672+"-"+1234+"\t\\"+20000);
		
		
	}

	
	
}
