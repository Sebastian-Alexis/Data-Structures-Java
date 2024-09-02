package chapter1;

/*
Suppose that we create an array A of GameEntry objects, which has an integer
scores field, and we clone A and store the result in an array B. If we then im-
mediately set A[4].score equal to 550, what is the score value of the GameEntry
object referenced by B[4]?
 */

public class ProbTwo {
    private Integer score;
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public static void main (String[] args) {
        ProbTwo[] a = new ProbTwo[5];
        for (int i = 0; i < 5; i++) {
            a[i] = new ProbTwo();
        }
        ProbTwo[] b = a.clone();
        a[4].setScore(550);
        System.out.println("A array " + a[4].getScore());
        System.out.println("B array " + b[4].getScore());


    }
}