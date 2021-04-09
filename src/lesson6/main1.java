package lesson6;

public class main1 {
    public static void main(String[] args) {
        int result = Main.minNum(9, 4, 5);
        System.out.println(result);

        String figura = Main.figura(3, 3, 4, 5);
        System.out.println(figura);

        int countWords = StringUtil.countWords("Привет меня зовут Саша а тебя? ");
        System.out.println(countWords);

        StringUtil.reverse("Привет меня зовут Саша а тебя");

        StringUtil.printPoints("joijdoijf1.sss/sds?");

       HomeWorkLesson6StringUtils.splittingByLine("I am programmer");

       HomeWorkLesson6StringUtils.sumSymbolsOfText("dASAWCSsdsdd.s123,ds");
       HomeWorkLesson6StringUtils.compareWordCount("привет как дела","как дела братан");
       HomeWorkLesson6StringUtils.evenVsOdd(2,3,4,5,6);
       HomeWorkLesson6StringUtils.capitalLetter("i im programmer");

       StringUtil.replaceFirstWordsSymbolWithUpper("привет я програмист а ты кто");



    }

}
