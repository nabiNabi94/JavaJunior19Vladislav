package lesson9;

public class Test {
    private String image;
    private String nameTest;
    private String description;
    private Question[] questions = new Question[100];

    public Test (){

    }
    public Test (String image,String nameTest,String description){
        this.image = image;
        this.nameTest = nameTest;
        this.description = description;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addQuestionToTest (Question question){
        for (int i = 0; i < questions.length;i++){
            if (questions[i] == null){
                questions[i] = question;
                break;
            }
        }
    }
}


