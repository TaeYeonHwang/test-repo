package codetest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution(127);
		int[] arr={1,2,5,3,4};
		/*
		boolean[] testarr = new boolean[arr.length];
		for(int i=0;i<testarr.length;i++){
			testarr[i]=true;
		}
		for(boolean b:testarr){
			System.out.println(b);
		}
		*/
		solution(arr);
		//System.out.println(solution(5874));
		
	}

	 public static boolean solution(int[] arr) {
	        boolean answer = true;
	        //������ �������� ���� �ܼ��� ����� �׳� 1 �� ã��, 2 �� ã�� �̰ǵ�....
	        //�׷��� ����ð� �����Ͱ�����;;
	        int length = arr.length;
	        boolean[] testarr = new boolean[arr.length];
	       
	        for(int i=0;i<testarr.length;i++){
	            testarr[i]=true;
	        }
	        
	        //�׳� for�� ���� ��ȭfor�� ���� ������.
	        for(int i:arr){
	            if(testarr[i-1]){
	                testarr[i-1]=false;
	            }
	            else{
	                answer=false;
	                break;
	            }
	            System.out.println(answer);
	        }
	        
	        return answer;
	    }
	
	public static int solution(int n) {
		int answer = 0;
        int count=1,div=1;
        int bound=1;
        while(n/div>10){
            div*=10;
            count++;
        }
        //������� �ϸ� ���ڸ� �� ���� �� �� ����. 
        
        //10�� �����ڸ��� ����� ����.
        for(int i=1;i<count;i++){
            bound*=10;
        }
        //
        
        //���� ���س� count�� �̿��� �� ���� ���Ѵ�.
        for(int i=bound;i>=1;i=i/10){
            answer+=n/i;
            System.out.println(answer);
            n-=(n/i)*i;
            System.out.println(n);
        }
        //
        //�Ҹ����� ���....^�� ��Ʈ���� XOR�����ϴ� ��������...
        
		return answer;
	}
}
