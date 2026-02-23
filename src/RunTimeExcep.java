public class RunTimeExcep extends RuntimeException{
    private String message;
    public RunTimeExcep(String message){
        super("Несовершеннолетний: " + message);
        this.message=message;


    }

}
