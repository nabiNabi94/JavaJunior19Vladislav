package lesson17;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImple utils = new StringUtilsImple();

        try {
            System.out.println(utils.div("2","5"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    }
