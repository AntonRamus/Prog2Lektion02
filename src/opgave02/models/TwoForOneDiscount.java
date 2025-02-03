package opgave02.models;

import java.util.ArrayList;

public class TwoForOneDiscount extends Discount {
    private final String description;

    public TwoForOneDiscount(String description) {
        this.description = description;
    }

    @Override
    public double applyDiscount(Basket basket) {
        int numberOfDiscountedBooks = basket.getItems().size() / 2;
        double totalDiscount = 0;
        ArrayList<Book> sortedItems = selectionSort(basket.getItems());
        for (int i = 0; i < numberOfDiscountedBooks; i++) {
            totalDiscount -= sortedItems.get(i).getPrice();
        }
        return totalDiscount;
    }

    @Override
    public String getDescription() {
        return description;
    }

    private ArrayList<Book> selectionSort(ArrayList<Book> books) {
        ArrayList<Book> bookArray = books;
        int length = bookArray.size();

        for (int i = 0; i < length - 1; i++) {
            Book cheapestBook = bookArray.get(i);
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (bookArray.get(j).getPrice() < cheapestBook.getPrice()) {
                    cheapestBook = bookArray.get(j);
                    index = j;
                }
            }
            if (i != index) {
                bookArray = swap(bookArray, i, index);
            }
        }
        return bookArray;
    }

    private ArrayList<Book> swap(ArrayList<Book> bookArray, int index, int indexOfMin) {
        Book book = bookArray.get(index);
        bookArray.set(index, bookArray.get(indexOfMin));
        bookArray.set(indexOfMin, book);
        return bookArray;
    }
}
