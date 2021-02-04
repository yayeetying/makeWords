public class MakeWords {

  /*Print all words that are made of the letters a-z inclusive.
  *@param length : the length of the words that are to be printed
  */
  public static void printAllWords(int length){ //wrapper method
    printAllWords(length,"");
  }

  /*Print all words that are made of the letters a-z inclusive.
  *@param word : the partial word so far.
  */
  public static void printAllWords(int length,String word){
    if (word.length() == length) { //int length stays the same
      System.out.println(word);
    }
    else { //using ASCII
      for (char character = 'a'; character <= 'z'; character++) {
        printAllWords(length, word+character);
      }
    }
  }

  /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
  *aax is not allowed, but axa is allowed.
  *@param length : the length of the words that are to be printed
  *@param letters: the letters you should be using
  */
  public static void printNoDoubleLetterWords(int length,char[] letters){
    printNoDoubleLetterWords(length,"",letters);
  }

  /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
  *aax is not allowed, but axa is allowed.
  *@param length : either how many more letters need to be
  *@param word   : the partial word so far.
  *@param letters: the letters you should be using
  */
  public static void printNoDoubleLetterWords(int length,String word,char[]letters){
    if (length == 0) { //decrement int length
      System.out.println(word);
    }
    else {
      for (char c : letters) {
        if (word.length() >= 1 && c == word.charAt(word.length()-1)) { //short circuiting<3
          //Do nothing!! just let method end w/o calling itself

          // char[] breaker = new char[0];
          // printNoDoubleLetterWords(length, word, breaker);

          //System.out.println(word + " adjacent");
          //printNoDoubleLetterWords(length, word+Character.toString(letters[c++]), letters);
        }
        else { //the magic of else T_T
          printNoDoubleLetterWords(length-1, word+Character.toString(c), letters);
        }
      }
    }
  }

  public static void main(String[] args) {
    //printAllWords(3);
    char[] churs = new char[]{'a','b','c','d','e','f','g','h'};
    printNoDoubleLetterWords(3,churs);
    printNoDoubleLetterWords(2,churs);
    printNoDoubleLetterWords(churs.length,churs);

  }

}
