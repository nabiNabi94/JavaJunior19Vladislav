package lesson9;

public class Option {
    private String option;
    private boolean isTrue;


    public Option (){

    }
    public Option (String option,boolean isTrue){
        this.option = option;
        this.isTrue = isTrue;

    }

    public void setOption (String option){
        this.option = option;
    }
    public void setTrue (boolean isTrue){
        this.isTrue = isTrue;
    }

    public String getOption (){
        return this.option ;

    }
    public boolean isTrue (){
        return this.isTrue;
    }

}
    

