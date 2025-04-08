package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO tady bude kód
    for (int i = 0; i < 4 ; i++) {
      drawHouse();
      startAgain();
    }
  }

  public void drawSquare(){
    for (int i = 0; i < 4 ; i++) {
      zofka.turnLeft(90);
      zofka.move(100);
    }
  }
  public void drawRoof(){
    zofka.turnLeft(30);
    zofka.move(100);
    zofka.turnLeft(120);
    zofka.move(100);
  }

  public void drawHouse(){
    drawSquare();
    drawRoof();
  }

  public void startAgain(){
    zofka.penUp();
    zofka.turnLeft(120);
    zofka.move(250);
    zofka.turnLeft(90);
    zofka.penDown();
  }
}
