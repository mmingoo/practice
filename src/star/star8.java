package star;

class Star8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i+4;j++){
                if(i+j>=6){ // i+j==6 || i==j){
                    System.out.printf("[%d,%d]",i,j);
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}
