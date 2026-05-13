class game{
    public void play(){
        System.out.println("Playing game");
    }
}

interface Ludo {
    public void playLudo();
    
}

public class AnanoymousClass {
    public static void main(String[] args) {
        game g1= new game(){
            @Override // child class of game
            public void play() {
                System.out.println("Playing chess");
            }
        };
        g1.play();

      //  Ludo l1= new Ludo(); not legal
        Ludo l1= new Ludo(){ // anonymous class that implements Ludo interface
            @Override
            public void playLudo() {
                System.out.println("Playing Ludo");
            }
        };
        l1.playLudo();

    }
}
