package list_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(new Book("红楼梦", 25.2, "曹雪芹"));
        list1.add(new Book("三国演义", 17.8, "罗贯中"));
        list1.add(new Book("水浒传", 20.8, "施耐庵"));

        for (Object book : list1) {
            System.out.println(book);
        }

        sort(list1);
        System.out.println("===排序后===");

        for (Object book : list1) {
            System.out.println(book);
        }
    }

    // 如何对集合排序
    public static void sort(List list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }

    static class Book {
        private String name;
        private String author;
        private double price;

        public Book(String name, double price, String author) {
            this.author = author;
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\t\tPrice: " + price + "\t\tAuthor: " + author;
        }
    }
}
