package question2;

public class HiddenWord {

	public static String hiddenWord;
	
	public HiddenWord(String word){
		hiddenWord = word;
	}
	
	public static void getHint(String guess){
		
//		String hint = hiddenWord;
//		char[] hintArray = hint.toCharArray();
//		char[] guessArray = guess.toCharArray();
//		
//		if(guess.contentEquals(hiddenWord)){
//			System.out.println("You correctly guessed the word!");
//			System.out.println("The correct word was " + guess);
//		}
//		
//		if(guess.contentEquals(hiddenWord)==false){
//			for(int i = 0; i<hiddenWord.length(); i++){
//
//				if(hiddenWord.contains(guess.substring(i, i+1))){
//					hintArray[i] = '+';
//				}
//				if(guessArray[i] == hiddenWord.charAt(i)){
//					hintArray[i] = guessArray[i];
//				}
//				if(!hiddenWord.contains(guess.substring(i, i+1))){
//					hintArray[i] = '*';
//				}
//			}
//			System.out.println(String.valueOf(hintArray));
//		}
		
		String hint = "";
		for(int i = 0; i < guess.length(); i++){
			if(guess.substring(i, i+1).equals(hiddenWord.substring(i, i+1))){
				hint += guess.substring(i, i+1);
			} else if(hiddenWord.indexOf(guess.substring(i, i+1)) != -1){
				hint += "+";
			} else {
				hint += "*";
			}
		}
		System.out.println(hint);
		
	}
}