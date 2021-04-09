package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Option option1 = new Option("in",true);
        Option option2 = new Option("by",false);
        Option option3 = new Option("on",false);
        Option option4 = new Option("at",false);
        Option option5 = new Option("don't",false);
        Option option6 = new Option("not",false);
        Option option7 = new Option("doesn't",true);
        Option option8 = new Option("no",false);

        Question question1 = new Question("My grandmother started work … 1960");
        question1.addOptionToQuestion(option1);
        question1.addOptionToQuestion(option2);
        question1.addOptionToQuestion(option3);
        question1.addOptionToQuestion(option4);

        Question question2 = new Question("She … like football");
        question2.addOptionToQuestion(option5);
        question2.addOptionToQuestion(option6);
        question2.addOptionToQuestion(option7);
        question2.addOptionToQuestion(option8);

        Test test1 = new Test();
        test1.setImage("http://easy-it-courses.com/resources/images/tests/icons/Test6.png");
        test1.setNameTest("Тест \"Определите уровень английского языка\"");
        test1.setDescription("Вы хотите выбрать для себя подходящую профессию в IT сфере, но не знаете с чего лучше начать? Не уверены, что подходит Вам профессия «Тестировщик»? Или может нужно учить программирование?\n" +
                "\n" +
                "Специально разработанный тест от EasyIT поможет Вам разобраться, подходит ли Вам профессия «Тестировщик», исходя из Ваших личностных качеств, умений и навыков.\n" +
                "\n" +
                "Желаем Вам успехов!");
        test1.addQuestionToTest(question1);
        test1.addQuestionToTest(question2);



        Scanner scanner = new Scanner(System.in);
        System.out.println(test1.getNameTest());

        question1.printToConsole();
        System.out.println("Введите ваш ответ:");
        int answer1 = scanner.nextInt();


        question2.printToConsole();
        System.out.println("Введите ваш ответ:");
        int answer2 = scanner.nextInt();

        boolean isTrue = true;
        for (int i = 0;i < question1.getOptions().length;i++){
            if (question1.getOptions()[i].isTrue()){
                if (i == answer1){
                    System.out.println("Первый вопрос правильный");
                    isTrue = false;
                }
            }
        }

        if (isTrue){
            System.out.println("Первый вопрос не верный");
        }


        boolean isTrue2 = true;
        for (int i = 0;i < question2.getOptions().length;i++){
            if (question2.getOptions()[i].isTrue()){
                if (i == answer2){
                    System.out.println("Второй вопрос правильный");
                    isTrue2 = false;
                }
            }
        }

        if (isTrue2){
            System.out.println("Второй вопрос не верный");
        }

    }
}


