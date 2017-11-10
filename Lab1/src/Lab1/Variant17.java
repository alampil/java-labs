package Lab1;


public class Variant17 {

	protected class classForBeginTask{
		private double res1,res2,res3;
		classForBeginTask(){
			
		}
		classForBeginTask(double res1,double res2,double res3){
			this.res1=res1;
			this.res2=res2;
			this.res3=res3;
		}
		void calculate(double A,double B,double C) {
			res1 = Math.abs(A - C);
			res2 = Math.abs(B - C);
			res3 = res1 + res2;
		}
		void print() {
			System.out.println("AB="+res1);
			System.out.println("BC="+res2);
		}
		@Override
		public boolean equals(Object o) {
			if(o==this) {
				return true;
			}
			if(o==null||(o.getClass()!=this.getClass())) {
				return false;
			}
			classForBeginTask s =(classForBeginTask)o;
			 return (Math.abs(this.res1-s.res1)<0.01&&Math.abs(this.res2-s.res2)<0.01);
		}
	};
	public classForBeginTask beginTask(double A,double B,double C) {
		classForBeginTask temp =new classForBeginTask();
		temp.calculate(A, B, C);
		return temp;
	}
	
	public boolean booleanTask(int a){
		
		boolean bool = false;
	if((a > 99) && (a < 1000)){
		bool = true;
	}
	return bool;
	}
	
	public int integerTask(int a){int b;
		if(a<999){
			throw new AssertionError("Wrong input");
		}
		
		else{
			b = (a / 1000) % 10;
		}
		return b;
	}
	protected class classForIfTask{
		private double A,B,C;
		classForIfTask(double A, double B, double C){
			this.A=A;
			this.B=B;
			this.C=C;
			
		}
		classForIfTask(){
			
		}
		void calculate(double a, double b, double c){
			this.A=a;
			this.B=b;
			this.C=c;
			if((A<B)&&(B<C) || (A>B)&&(B>C)){
				A=A*A;
				B=B*B;
				C=C*C;
			}
			else{
				A=-A;
				B=-B;
				C=-C;	
			}
			
		}
		@Override 
		public boolean equals(Object o) {
			if(o==this) {
				return true;
			}
			if(o==null||(o.getClass()!=this.getClass())) {
				return false;
			}
			classForIfTask s =(classForIfTask)o;
			 return (Math.abs(this.A-s.A)<0.01&&Math.abs(this.B-s.B)<0.01&&Math.abs(this.C-s.C)<0.01);
		}
		
	};
	public classForIfTask ifTask(double A,double B,double C) {
		classForIfTask temp =new classForIfTask();
		temp.calculate(A, B, C);
		return temp;
	}
	public String caseTask(int n){
		String str = "";
		if(n/10==1)switch(n){
		case 10:
			str+=("ten study assignments");
			break;
		case 11:
			str+=("eleven study assignments");
			break;
		case 12:
			str+=("twelve study assignments");
			break;
		case 13:
			str+=("thirteen study assignments");
			break;
		case 14:
			str+=("fourteen study assignments");
			break;
		case 15:
			str+=("fifteen study assignments");
			break;
		case 16:
			str+=("sixteen study assignments");
			break;
		case 17:
			str+=("seventeen study assignments");
			break;
		case 18:
			str+=("eighteen study assignments");
			break;
		case 19:
			str+=("nineteen study assignments");
			break;
		}
		else{
			switch (n/10){
			case 2:
				str+=("twenty ");
                break;
            case 3:
            	str+=("thirty ");
                break;
            case 4:
            	str+=("forty ");
                break;
			}
			switch (n%10) {
	        case 1:
	        	str+=("one ");
	            break;
	        case 2:
	        	str+=("two ");
	            break;
	        case 3:
	        	str+=("three ");
	            break;
	        case 4:
	        	str+=("four ");
	            break;
	        case 5:
	        	str+=("five ");
	            break;
	        case 6:
	        	str+=("six ");
	            break;
	        case 7:
	        	str+=("seven ");
	            break;
	        case 8:
	        	str+=("eight ");
	            break;
	        case 9:
	        	str+=("nine ");
	            break;
	        }
			switch (n%10){
			case 0:
	        case 5:
	        case 6:
	        case 7:
	        case 8:
	        case 9:
	        	str+=("learning assignments.");
	            break;
	        case 1:
	        	str+=("learning assignment.");
	            break;
	        case 2:
	        case 3:
	        case 4:
	        	str+=("study assignments.");
	            break;
			}
		}
		
		return str;
		
	}
	
	
	
	public double forTask(int N, double A){
		if(N<1) {
    		throw new AssertionError("Wron input");
    	}
		
		double A2=1;
		double rez=1;
		for(int i=2;i<=N;++i){
			A2*=A;
			rez+=A2;
		}
		return rez;	
	}
	 public int[] whileTask(int N){
	        if(N < 1) {
	            throw new AssertionError("Wrong input");
	        }
	        int tmp = N, count = 0;
	        while(tmp > 0) {
	            tmp /= 10;
	            count++;
	        }
	        int b [] = new int[count];
	        int i = 0;
	        while(N > 0){
	            b[i] = N%10;
	            N /= 10;
	            i++;
	        }
	        return b;
	    }
	
	public int arrayTask(int[] a,int n){
		int[] mas = new int[n]; 
		int max;
		for (int i=1;i<n-1;++i){
	        if ((a[i-1]>a[i]) && (a[i]<a[i+1])) {
	            mas[i]=a[i];
	        }
	    }
		max = mas[0];
		for(int i = 0; i<mas.length; i++){
			if(mas[i]>max){
				max = mas[i];
			}
		}
		return max;
		
	}
	public double [][] martixTask(double[][] arr) {
        int n = arr.length, m = arr[0].length;
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(arr[i][j] <= min) {
                    min = arr[i][j];
                    index = i;
                }
            }
        }
        double [][] res = new double[n-1][m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i != index) {
                for (int j = 0; j < m; j++) {
                    res[k][j] = arr[i][j];
                }
                k++;
            }
        }
        return res;
    }
		
		
	

public static void  main(String[] args) {
	
		
		
	}
}
