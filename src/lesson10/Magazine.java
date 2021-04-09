package lesson10;

public class Magazine extends PublicEdition{

    public Magazine (){

    }


    @Override
    public String getName() {
        return super.getName();

    }

    @Override
    public String getAuthorName() {
        return super.getAuthorName();
    }

    @Override
    public int getNumberOfCopies() {
        return super.getNumberOfCopies();
    }

    @Override
    public int getNumberOPages() {
        return super.getNumberOPages();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAuthorName(String authorName) {
        super.setAuthorName(authorName);
    }

    @Override
    public void setNumberOfCopies(int numberOfCopies) {
        super.setNumberOfCopies(numberOfCopies);
    }

    @Override
    public void setNumberOPages(int numberOPages) {
        super.setNumberOPages(numberOPages);
    }

    @Override
    public String toString() {
        return "Magazine{}";
    }
}
