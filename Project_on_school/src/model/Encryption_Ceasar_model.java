package model;

public class Encryption_Ceasar_model {
	private String plainText;
	private int key;
	private String cypher;

	
	public Encryption_Ceasar_model() {
		
	}
	public String getPlainText() {
		return plainText;
	}
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getCypher() {
		return cypher;
	}
	public void setCypher(String cypher) {
		this.cypher = cypher;
	}
	
	
	public void encrytion(){
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] arrayAlphabet = alphabet.toCharArray();
		char[] plainTextArray = this.plainText.toCharArray();
		char[] arrayResult = new char[plainTextArray.length];
		int bientam=0;

	continueAr1:for (int i = 0; i <plainTextArray.length; i++) 
	{
			for (int j = 0; j < arrayAlphabet.length; j++) 
			{
				if(plainTextArray[i]==arrayAlphabet[j])
				{
					int result = (j+this.key) % 26;
					for (int k = 0; k < arrayAlphabet.length; k++) 
					{
						if(result==k)
						{
							arrayResult[bientam] = arrayAlphabet[k];
							bientam++;
							continue continueAr1;
						}
					}
					 
					
				}
			}
		}
	String result = new String(arrayResult);
	this.cypher= result;
	}
	
	public void decryption() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] arrayAlphabet = alphabet.toCharArray();
		char[] plainTextArray = this.plainText.toCharArray();
		char[] arrayResult = new char[plainTextArray.length];
		int bientam=0;

	continueAr1:for (int i = 0; i <plainTextArray.length; i++) 
	{
			for (int j = 0; j < arrayAlphabet.length; j++) 
			{
				if(plainTextArray[i]==arrayAlphabet[j])
				{
					int result = (j - this.key) % 26;
					for (int k = 0; k < arrayAlphabet.length; k++) 
					{
						if(result==k)
						{
							arrayResult[bientam] = arrayAlphabet[k];
							bientam++;
							continue continueAr1;
						}
					}
					 
					
				}
			}
		}
	String result = new String(arrayResult);
	this.cypher= result;
	}
	
}
