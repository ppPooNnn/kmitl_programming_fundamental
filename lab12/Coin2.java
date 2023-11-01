public class Coin2 {
    String tailColor;
    boolean isHead;

    void flip()
    {

    }

    void hit(Coin c)
    {

    }

    void hit(Coin c1, Coin c2)
    {

    }

    @Override
    public String toString() {
        return "Coin2 [tailColor=" + tailColor + ", isHead=" + isHead + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tailColor == null) ? 0 : tailColor.hashCode());
        result = prime * result + (isHead ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coin2 other = (Coin2) obj;
        if (tailColor == null) {
            if (other.tailColor != null)
                return false;
        } else if (!tailColor.equals(other.tailColor))
            return false;
        if (isHead != other.isHead)
            return false;
        return true;
    }

    
}
