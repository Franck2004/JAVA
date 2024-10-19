
public	class	exoheritage 
{	
    public	static	void	main	(String	args[]) 
    {	
        Cercle	c	=	new	Cercle	(3,	8,	2.5)	; 
        c.affiche()	; 
        c.deplaceCentre	(1,	0.5); 
        c.changeRayon	(5.25)	; 
        c.affiche()	; 
        Point	a	=	c.getCentre()	;
        a.affiche()	; 
    } 
}
class	Point 
{	
    public	Point	(double	x,	double	y)	
    {	
        this.x=x	;	
        this.y=y	;	
    } 
    public	void	deplace	(double	dx,	double	dy)	
    {	
        x+=dx	;	
        y+=dy	;	
    } 
    public	void	affiche	() 
    {	
        System.out.println	("Point	de	coordonnees	"	+	x	+	"	"	+	y)	; 
    } 
    public	double	getX()	
    {	
        return	x	;	
    } 
    public	double	getY()	
    {	
        return	y	;	
    } 
    private	double	x,	y	; 
}
class Cercle extends Point
{
    public double rayon ;
    public Cercle(int x, int y, double rayon)
    {
        super(x,y);
        this.rayon = rayon;
    }
    public void changeRayon(double r)
    {
        this.rayon = r;
    }
    public void deplaceCentre(double dx, double dy)
    {
        super.deplace(dx, dx);
    }
    public Point getCentre()
    {
        Point centreCercle = new Point(getX(),getY());
        return centreCercle;
    }
    
    public	void	affiche	() 
    {	
        System.out.println	("Cercle	de	centre	"	+	super.getX()	+	"	"	+ super.getY() +	"	et	de	rayon	"	+	rayon);
    }
}