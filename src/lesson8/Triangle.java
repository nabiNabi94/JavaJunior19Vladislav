package lesson8;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle (){
    }
    public Triangle (int sideA, int sideB, int sideC){ // Это конструктор
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public void setSideA(int sideA) {
        this.sideA = sideA;

    }

    public void setSideB(int sideB) {
        this.sideB = sideB;

    }

    public void setSideC(int sideC) {
        this.sideC = sideC;

    }

    public int getSideA (){
        return this.sideA;
    }

    public void printTapeTriangle() {
        if (sideA == sideB && sideA == sideC) {
            System.out.println("Это равносторонний треугольник");
        }else if (sideA != sideB && sideA != sideC){
            System.out.println("Это разносторонний трекгольник");
        }else {
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
