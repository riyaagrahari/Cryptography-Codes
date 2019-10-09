import java.util.*;
 
class Caesar
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int shift,i,n;
 String plain_text;
 String s1="";
 String s2="";
 System.out.println("Enter the plaintext message");
 plain_text=sc.nextLine();

 
 n=plain_text.length();
 char ch_arr1[]=plain_text.toCharArray();
 char encrypted,ch;
 System.out.println("Enter the shift value");
 shift=sc.nextInt();
 
 System.out.println();
 System.out.println("Encrypted messsage is");
 for(i=0;i<n;i++)
 {
	 
 if(Character.isLetter(ch_arr1[i]))
 {
	 if(Character.isUpperCase(ch_arr1[i]))
 {
 encrypted=(char)(((int)ch_arr1[i]+shift-65)%26+65);
 
 }
 else
 {
 encrypted=(char)(((int)ch_arr1[i]+shift-97)%26+97);
 }
s1=s1+encrypted;
 } 
 else if(ch_arr1[i]==' ')
 {
 s1=s1+ch_arr1[i];
 } 
 }
 System.out.println(s1);
 
 System.out.println();
 System.out.println("Decrypted message is");
 
 char ch_arr2[]=s1.toCharArray();
 for(i=0;i<s1.length();i++)
 {
 if(Character.isLetter(ch_arr2[i]))
 {
 if(Character.isUpperCase(ch_arr1[i]))
 {
	 if(((int)ch_arr2[i]-shift)<65)
		ch=(char)(((int)ch_arr2[i]-shift-65+26)%26+65);
	else
		ch=(char)(((int)ch_arr2[i]-shift-65)%26+65);
 }
 else
 {
	  if(((int)ch_arr2[i]-shift)<97)
		ch=(char)(((int)ch_arr2[i]-shift-97+26)%26+97);
	else
		ch=(char)(((int)ch_arr2[i]-shift-97)%26+97);
 }
 s2=s2+ch;
 } 
 
 else if(ch_arr2[i]==' ')
 {
 s2=s2+ch_arr2[i];
 } 
 }
 System.out.println(s2);
 }
}