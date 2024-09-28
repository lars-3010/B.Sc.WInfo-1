package model;

public class Triple<T> {

    private T first;
    private T second;
    private T third;

    public Triple (T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst(){
        return first;
    }
    public void setFirst(T first){
        this.first = first;
    }

    public T getSecond(){
        return second;
    }
    public void setSecond(T second){
        this.second = second;
    }

    public T getThird(){
        return third;
    }
    public void setThird(T third){
        this.third = third;
    }


    public void shiftLeft(){
        T temp = first;
        first = second;
        second = third;
        third = temp;
    }

    public void shiftRight(){
        T temp = third;
        third = second;
        second = first;
        first = temp;
    }

    public String toString(){
        return "<" + this.first + ", "+ this.second + ", "+ this.third + ">";
    }
}
