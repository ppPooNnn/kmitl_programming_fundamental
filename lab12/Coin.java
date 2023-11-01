class Coin
{
    String tailColor;
    boolean isHead;

    Coin(String color)
    {
        tailColor = color;
        isHead = true;
    }

    @Override
    public String toString() {
        return "I am a coing object with tailColor = " + tailColor + ". My isHead is " + isHead;
    }
    
    void flip()
    {
        if (isHead)
            System.out.println("From flip() -> I am head my color is SILVER (my tailColor is \"" + tailColor + ")");
        else
            System.out.println("From flip() -> My face color is " + tailColor);
        isHead = !isHead;
    }

    void hit(Coin c)
    {
        if (!this.equals(c))
            this.flip();
            c.flip();
    }

    void hit(Coin c1, Coin c2)
    {
        System.out.println("Coin with tailColor = " + this.tailColor + " hits me.");
        c1.flip();
        System.out.println("Coin with tailColor = " + this.tailColor + " hits me.");
        c2.flip();
        this.flip();
    }
}