/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kat;

/**
 *
 * @author burhan
 */
public class Hund {
    //Variabler som kun kan tilgås fra denne klasse
    private int alder=0;
    private String name = "";
    
    //Constructor 
    public Hund()
    {
        System.out.println("Ny hund)"); //Udskriver denne hver gang der bliver oprettet en objekt af denne klasse
    }
    //Constructor med en argument
    public Hund(int alder)
    {
        this.alder=alder;//Denne alder sættes til at være alder
        System.out.println("Ny hund er antal år"+alder); //Udskriver denne hver gang en objekt skabes med argumentet
    }
    //Constructor med en argument
    public Hund(String name)
    {
       this.name=name; //Denne navn bliver sættes til at være name  
        System.out.println("Ny hund navn"+name);//Udskriver denne når der kører bliver laver et objekt med argumentet
    }
    
    //En getter som tilbagemelder name
    public String GetDogName()
    {
        return name;
    }
    //En set som sætter navnet med argumenten
    public void SetDogName(String name)
    {
        this.name=name;
    }
    //En metode spiser
    public void Spiser()
    {
        System.out.println("hunden spiser");//Udskriver følgende når metoden køres fra main metoden.
    }
    
            
    
}
