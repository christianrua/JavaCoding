/*
Language Families

Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, we’ll focus on something that often 
varies between language families: word order — where the subject, verb, and object would go in a sentence.

For example, in English, you would use subject-verb-object order:
subject 	verb 	object
She 	eats 	noodles

But in Japanese, you would use subject-object-verb order:
subject 	object 	verb
彼女は 	麺を 	食べる
(she) 	(noodles) 	(eats)

Your Language Inheritance package has three Java files:

    Language.java: for the Language parent class, which serves as the template for all languages.
    Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family.
    SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.

Build out a Java package with these classes to model real-world language families.

*/
class Language{
  
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  Language(String langName,int speakers, String regions,String wdOrder){
    this.name=langName;
    this.numSpeakers=speakers;
    this.regionsSpoken=regions;
    this.wordOrder=wdOrder;
  }
  
  public void getInfo(){
    System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+".");
    System.out.println("The language follows the word order: "+this.wordOrder+".");
  }
  
  
  public static void main(String[] args){
  	Language Spanish=new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    Spanish.getInfo();
    
    Language kiche=new Mayan("Ki'che'", 2330000);
    kiche.getInfo();
    
     Language mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfo();
  Language burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfo();
  }
}
