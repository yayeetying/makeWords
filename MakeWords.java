public class MakeWords {

  // //wrapper method
  // public static void printBinary(int length){
  //   printBinary(length,"");
  // }
  // public static void printBinary(int n,String word){
  //   if(n == word.length()){
  //     System.out.println(word);
  //   }else{
  //     printBinary(n,word+"0");
  //     printBinary(n,word+"1");
  //   }
  // }

  /*
@param n : the length of the words to print
@param letters : an array of all valid characters
@param word: partial solution
print all words made of n letters
*/
// public static void printWords(int n,String word,char[]letters){
//   if(n == 0){
//     System.out.println(word);
//   }else{
//     for ( char c : letters){
//       printWords(n-1,word+c,letters);
//     }
//   }
// }

  /*Print all words that are made of the letters a-z inclusive.
  *@param length : the length of the words that are to be printed
  */
  public static void printAllWords(int length){ //wrapper method
    printAllWords(length,"");
  }

  /*Print all words that are made of the letters a-z inclusive.
  *@param length : either how many more letters need to be
  *@param word : the partial word so far.
  */
  public static void printAllWords(int length,String word){
    if (word.length() == length) { //int length ain't changing
      System.out.println(word);
    }
    else { //using ASCII
      for (char character = 'a'; character <= 'z'; character++) {
        printAllWords(length, word+character);
      }
    }
  }

  public static void main(String[] args) {
    //printBinary(3);
    // char[] lotsaChars = new char[]{'a','b','c','d','e'};
    // printWords(3, "", lotsaChars);

  }

}
