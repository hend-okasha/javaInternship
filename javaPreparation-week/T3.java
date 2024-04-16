public class T3 {
    public static void main(String[] args) {
      evenNums();
    }
    public static void evenNums(){
        System.out.println("even numbers between 1 and 20 is :" );
        for( int i=1; i <=20; i++ ){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}