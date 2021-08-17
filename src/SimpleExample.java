public class SimpleExample {

    public int number;

    public SimpleExample(){
    }
    public SimpleExample( int val){
        number= val;
    }
    public void SetValue(int val){
        number= val;
    }

    public int getNumber(){
        return  number;
    }

    public static  void main(String[]args){
        for(int i = 0; i<10;i++){
            SimpleExample example= new SimpleExample();

            if (i<=5){
                example.SetValue(i);
            }else {
                example.SetValue(i*10);
            }
            System.out.println("SimpleExample#" +i+ "s value is " + example.getNumber());
        }
    }
}
