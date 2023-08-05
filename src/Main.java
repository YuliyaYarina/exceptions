import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
       try {
           Validator.validateWithRegex("login", "password", "confirmPassword");
       }catch (WrongLoginException ex){
       }catch (RuntimeException ex){
           throw ex;
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }
}