package Exception;

//Throw and Throws


class InvalidMemberException extends Exception{

    public InvalidMemberException(String message) {
        super(message);
    }
}
class BookUnavailabelException extends Exception{

    public BookUnavailabelException(String message) {
        super(message);
    }
}

//    public void borrowBook(int booksRequested){
//        try{
//            int[] books = {101, 102, 103};
//            System.out.println("Book Requested :" + books[booksRequested]);
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception Occured");
//        }
//        catch(NullPointerException e){
//            System.out.println("NullPointerException");
//        }finally {
//            System.out.println("Finally Block");
//        }
//
//    }

//    public void borrowBook(int booksRequestedCount) {
//        try {
//            if (booksRequestedCount > availableBooks) {
//                throw new Exception("Not enough books available");
//            }
//
//            System.out.println("Books borrowed successfully: " + booksRequestedCount);
//
//        } catch (Exception e) {
//            // Catches the custom thrown exception
//            System.out.println("Exception Occurred: " + e.getMessage());
//
//        } finally {
//            System.out.println("Finally Block");
//        }
//    }

class Library {
    int availableBooks = 3;
    public void borrowBook(String memberName, int booksRequestedCount) throws Exception {

        if (booksRequestedCount > availableBooks)
            throw new BookUnavailabelException("Not enough books available");

        if (booksRequestedCount < 0)
            throw new Exception("You must request at least 1 book");

        if (memberName == null || memberName.isEmpty())
            throw new InvalidMemberException("Invalid memebership");
    }
}

    public class LibraryDemo {
        public static void main(String[] args) {
            Library library = new Library();
            try {
                library.borrowBook("John",1);
                library.borrowBook("null",1);
            }
            catch (BookUnavailabelException e) {
               e.printStackTrace();
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception Occured " + e.getMessage()

                );
            }

        }
    }

/*
class Library {
    int availableBooks = 3;
    public void borrowBook(int booksRequestedCount) throws Exception {

        if (booksRequestedCount > availableBooks)
            throw new Exception("Not enough books available");

        if (booksRequestedCount < 0)
            throw new Exception("You must request at least 1 book");
    }
}
*/