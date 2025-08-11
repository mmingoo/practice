package star;

class Star9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
				if(!((i+j<=6 && i<=j )||(i>=j && i+j>=6))){  // 나비 모양
//                if((i+j<=6 && i<=j )||(i+j>=6&& i>=j )){
                    System.out.printf("[%d,%d]",i,j);
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}