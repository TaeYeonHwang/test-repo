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
	        //솔직히 생각나는 제일 단순한 방법은 그냥 1 쭉 찾고, 2 쭉 찾고 이건데....
	        //그러면 실행시간 터질것같은디;;
	        int length = arr.length;
	        boolean[] testarr = new boolean[arr.length];
	       
	        for(int i=0;i<testarr.length;i++){
	            testarr[i]=true;
	        }
	        
	        //그냥 for문 말고 강화for문 쓰면 좋을듯.
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
        //여기까지 하면 몇자리 수 인지 알 수 있음. 
        
        //10의 제곱자리를 만들기 위함.
        for(int i=1;i<count;i++){
            bound*=10;
        }
        //
        
        //이제 구해논 count를 이용해 각 값을 더한다.
        for(int i=bound;i>=1;i=i/10){
            answer+=n/i;
            System.out.println(answer);
            n-=(n/i)*i;
            System.out.println(n);
        }
        //
        //소름돋는 사실....^는 비트단위 XOR연산하는 연산자임...
        
		return answer;
	}
}
