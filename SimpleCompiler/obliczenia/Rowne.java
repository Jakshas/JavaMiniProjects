package obliczenia;

public class Rowne extends Wyrazenie {
    Wyrazenie a;
    Wyrazenie b;    

    public Rowne(Wyrazenie a,Wyrazenie b){
        this.a=a;
        this.b=b;
    }    

    @Override
    public String toString() {
        
        return "("+(a.toString()+"=="+b.toString())+")";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rowne) {
            return ((Rowne)obj).a.equals(this.a) && ((Rowne)obj).b.equals(this.b);
        }
        return false;
    }
    @Override
    public int oblicz() {
        if(a.oblicz()==b.oblicz()){
            return 1;
        }else{
            return 0;
        }
    }
}
