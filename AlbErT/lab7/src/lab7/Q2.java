
package lab7;
class person {
    void name() {
        System.out.println("Name: Ram");
    }
}

class student extends person {  
    void id() {
        System.out.println("ID: 101");
    }
}

class Compony {
    void cname() {
        System.out.println("Compony Name: ABC ");
    }
}

class emply extends Compony { 
    void ename() {
        System.out.println("Employee Name: Sita");
    }
}

class add extends emply { 
    void address() {
        System.out.println("Address: Lalitpur");
    }
}


class sport {
    void sname() {
        System.out.println("Sport Name: Football");
    }
}

class tplayer extends sport {
    void tplayer() {
        System.out.println("No. of Total Player: 21");
    }
}

class player extends sport {  
    void player() {
        System.out.println("No of players: 11");
    }
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Single-level Inheritance:");
        student s1 = new student();
        s1.name();
        s1.id();
        System.out.println();

        System.out.println("Multi-level Inheritance:");
        add a1 = new add();
        a1.cname();
        a1.ename();
        a1.address(); 
        System.out.println();

       
        System.out.println("Hierarchical Inheritance:");
        tplayer t1 = new tplayer();
        t1.sname(); 
        t1.tplayer();
        
        player p1 = new player();
        p1.sname();
        p1.player();
    }
}
