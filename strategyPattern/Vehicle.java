public class Vehicle {
    Strategy st;

     Vehicle(Strategy st) {
        this.st=st;
    }
    void display(){
        st.display();
    }
    
}
