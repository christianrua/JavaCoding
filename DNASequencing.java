/*
DNA Sequencing

The genome of an organism stores all the genetic information necessary to build and maintain that organism. It is an organism’s 
complete set of DNA.

DNA is composed of a series of nucleotides abbreviated as:

    A: Adenine
    C: Cytosine
    G: Guanine
    T: Thymine

DNA

So a strand of DNA could look something like ACGAATTCCG.

Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

    It begins with a “start codon”: ATG.
    It ends with a “stop codon”: TGA.
    In between, each additional codon is a sequence of three nucleotides.

So for example:

    ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by by 3.
    ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.



*/

//program that determines whether there is a protein in a strand of DNA
public class DNA {

  public static void main(String[] args) {
		String dna1="ATGCGATACGCTTGA";
  	String dna2="ATGCGATACGTGA";
  	String dna3="ATTAATATGTACTGA"; 
  	String dna=dna3;
  	System.out.println(dna.length());  
    
		System.out.println(dna.indexOf("ATG"));
  	System.out.println(dna.indexOf("TGA"));
    
    int start=dna.indexOf("ATG");
    int end=dna.indexOf("TGA");
    
    
    if(start!=-1 && end!=-1 && (end-start)%3==0){
    	String protein=dna.substring(start,end+3);
      System.out.println("Protein: " + protein);
    }else{
     	System.out.println("No protein"); 
    }
  }

}
