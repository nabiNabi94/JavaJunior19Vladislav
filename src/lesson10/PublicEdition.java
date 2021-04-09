package lesson10;

import java.util.Objects;

public class PublicEdition {
    private String name;
    private String AuthorName;
    private int NumberOPages;
    private int NumberOfCopies;

    public PublicEdition (){

    }

    public PublicEdition(String name, String authorName, int numberOPages, int numberOfCopies) {
        this.name = name;
        AuthorName = authorName;
        NumberOPages = numberOPages;
        NumberOfCopies = numberOfCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getNumberOPages() {
        return NumberOPages;
    }

    public void setNumberOPages(int numberOPages) {
        NumberOPages = numberOPages;
    }

    public int getNumberOfCopies() {
        return NumberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        NumberOfCopies = numberOfCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicEdition)) return false;
        PublicEdition that = (PublicEdition) o;
        return getNumberOPages() == that.getNumberOPages() && getNumberOfCopies() == that.getNumberOfCopies() && Objects.equals(getName(), that.getName()) && Objects.equals(getAuthorName(), that.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthorName(), getNumberOPages(), getNumberOfCopies());
    }

    @Override
    public String toString() {
        return "PublicEdition{" +
                "name='" + name + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", NumberOPages=" + NumberOPages +
                ", NumberOfCopies=" + NumberOfCopies +
                '}';
    }

}

