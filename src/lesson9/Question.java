package lesson9;


public class Question {
    private String question;
    private Option[] options = new Option[4];

    public Question() {

    }


    public Question(String question) {
        this.question = question;

    }

    public void setQuestion(String question) {
        this.question = question;

    }

    public String getQuestion() {
        return this.question;
    }

    public void addOptionToQuestion(Option option) {
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null){
                options[i] = option;
                break;
            }
        }

    }

    public void printToConsole (){
        System.out.println(question);
        for (int i = 0;i < options.length;i++){
            if (options[i] != null){
                System.out.println((i) +" - " + options[i].getOption());
            }

        }
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }
}


