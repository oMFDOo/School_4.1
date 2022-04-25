import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

class Book {
    public static int num = 0;
    private String name, author;
    private double rating;
    public Book(){
        this.name="";
        this.author="";
        this.rating = 0.0;
    }
    public void setBook(String n, String a, double r){
        this.name = n;
        this.author = a;
        this.rating = r;
    }
    public void printBookInfo(){
        System.out.println("제목 : " + this.name);
        System.out.println("저자 : " + this.author);
        System.out.println("평점 : " + this.rating);
    }
}

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("==getInstance() 후 셋팅 변화 ==");
        Book[] book = new Book[100];
        book[0] = new Book();

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==== 목차 ====");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            int select = 0;
            select = sc.nextInt();
            switch (select){
                case 1 :
                    String n, a;
                    double r;
                    System.out.print("책제목을 입력하세요 : ");
                    n = sc.next();
                    System.out.print("저자를 입력하세요 : ");
                    a = sc.next();
                    System.out.print("평점을 입력하세요 : ");
                    r = sc.nextDouble();

                    book[book[0].num] = new Book();
                    book[book[0].num].setBook(n,a,r);
                    book[0].num++;
                    System.out.println("\n");
                    break;
                case 2 :
                    int bookNum;
                    System.out.print("찾으실 책의 번호를 입력하세요 : ");
                    bookNum = sc.nextInt();
                    book[bookNum].printBookInfo();
                    System.out.println("\n");
                    break;
                case 3 :
                    for(int i = 0; i < book[0].num; i++){
                        System.out.println("===============");
                        System.out.println("[" + i + "]");
                        book[i].printBookInfo();
                        System.out.print("\n");
                        System.out.println("===============");
                        System.out.println("\n");
                    }
                    break;
                case 4 :
                    System.exit(0);
                    break;
            }
        }
    }
}

