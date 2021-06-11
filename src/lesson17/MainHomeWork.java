package lesson17;

public class MainHomeWork {
    public static void main(String[] args) {
        StringUtilsImple utils = new StringUtilsImple();

        try {
            utils.findNumbers("saas5.5asfgf8.5jdh56f7.7kjdfh 7.4 ds.4kuu 6.4 h");
        } catch (CustomException e) {
            e.printStackTrace();
        }

        try {
            utils.findWord("hello world java","va");
        }catch (NullPointerException e){
            e.printStackTrace();
        }



    }



}
