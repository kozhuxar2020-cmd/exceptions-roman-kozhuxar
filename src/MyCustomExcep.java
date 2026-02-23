public class MyCustomExcep extends Exception{
    private String massege;
    public MyCustomExcep(String massege, Throwable cause){
        super(massege, cause);
    }

}
