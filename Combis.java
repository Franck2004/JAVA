import java.util.*;

public class Combis {
    
    static int montant,compt,n2c,n5c,n10c;

    public static void main(String[] args)
    {
       int nbf	=	0	; 
       for	(n10c=0	;	n10c<=10	;	n10c++) 
       for	(n5c=0	;	n5c<=20	;	n5c++) 
       for	(n2c=0	;	n2c<=50	;	n2c++) 
       if	(	2*n2c	+	5*n5c	+	10*n10c	==	100)	
       {	
        nbf	++	;	
        System.out.print	("1	F	=	")	;
        	if	(n2c	!=	0)	System.out.print	(n2c	+	"	X	2c")	;	
            if	(n5c	!=	0)	
            {	
                if	(n2c	!=	0)	System.out.print	("	+	")	;	
                System.out.print	(n5c	+	"	X	5c")	;	
            }	
            if	(n10c	!=	0)	
            {	
                if	((n2c	!=	0)	||	(n5c	!=	0))	System.out.print ("	+	")	;	
                System.out.print	(n10c	+	"	10c")	;	
            }	
            System.out.println	()	;	
        } 
        System.out.println	("En	tout,	il	y	a	"	+	nbf	+	"	facons	de	faire	1 F")	;
    }
}