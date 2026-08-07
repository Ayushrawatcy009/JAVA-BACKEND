

class laptop{
    String model;
    int price;
    public String toString(){
        return "hey";
    }

    //source code for hashcode
    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.model);
        hash = 71 * hash + this.price;
        return hash;
    } */

    //source code for equals
    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final laptop other = (laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    } */
}


public class object_class {
    public static void main(String[] args) {
       laptop obj1=new laptop();
       obj1.model="victus";
       obj1.price=1000;
       System.out.println(obj1); 
    }
}
