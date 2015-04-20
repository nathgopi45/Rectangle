class Rectangle{

    double length ;
    double breadth ;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        length=8;
        return length*breadth;
    }

    public static  void main(String asd[]){
        System.out.print(new Rectangle(2.0,2.0).area());
    }

}